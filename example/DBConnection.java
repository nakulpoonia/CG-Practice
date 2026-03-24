package org.example;




import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    private static volatile Connection connection;

    public static Connection getConnection(){

        if(connection == null){

            synchronized (DBConnection.class){

                if(connection == null){

                    try {
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitkara", "root", "Nakul@123");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return connection;

    }


    public static void closeConnection() {
        if (connection != null) {
            synchronized (DBConnection.class){

                if(connection != null){
                    try {
                        connection.close();
                        System.out.println("the connection is closed successfully");
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("error in closing connection : e - " + e);
                    }
                }
                connection = null;
            }
        }
    }

    public static void createTable(String tableName){
        if(connection != null){
            try {
                Statement st = connection.createStatement();
                st.execute("CREATE TABLE " +  tableName + " (id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(30), last_name VARCHAR(30), age INT)");
                System.out.println("table : " + tableName + " created successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            getConnection();
            createTable(tableName);
        }
    }

    public static void insertPerson(Person person){
        try {
            PreparedStatement st = connection.prepareStatement("INSERT INTO person VALUES(null, ?, ?, ?)");
            st.setString(1, person.getFirst_name());
            st.setString(2, person.getLast_name());
            st.setInt(3, person.getAge());

            System.out.println("rows affected : " + st.executeUpdate());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> getAllPerson(){
        List<Person> ans = new ArrayList();
        try{
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person");
            while(rs.next()){
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                int age = rs.getInt(4);

                Person person = new Person(first_name, last_name, age);
                ans.add(person);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return ans;
    }

    public static Person getPersonbyId(int id){
        Person ans = null;
        try{
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person where id = " + id);
            while(rs.next()){
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                int age = rs.getInt(4);

                ans = new Person(first_name, last_name, age);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return ans;
    }

    public static void deletePersonBYId(int id){
        try{
            Statement st = connection.createStatement();
            int rows_affected = st.executeUpdate("DELETE FROM person where id = " + id);
            if(rows_affected >= 1){
                System.out.println("Person with id " + id + " has been successfully deleted");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void updatePersonById(int id, Person person){
        try {
            PreparedStatement st = connection.prepareStatement(
                    "UPDATE person SET first_name = ?, last_name = ?, age = ? WHERE id = ?"
            );

            st.setString(1, person.getFirst_name());
            st.setString(2, person.getLast_name());
            st.setInt(3, person.getAge());
            st.setInt(4, id);

            int rows = st.executeUpdate();

            if (rows > 0) {
                System.out.println("Person updated successfully");
            } else {
                System.out.println("No person found with id " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Step 1: Get connection
        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println("Connected to database successfully");
        }



        DBConnection.createTable("persons");

        // Step 3: Insert data
        Person p1 = new Person("Nakul", "Poonia", 22);
        Person p2 = new Person("John", "Doe", 30);

        DBConnection.insertPerson(p1);
        DBConnection.insertPerson(p2);

        // Step 4: Fetch all data
        System.out.println("\nAll Persons:");
        List<Person> people = DBConnection.getAllPerson();
        for (Person p : people) {
            System.out.println(p);
        }

        // Step 5: Get person by ID
        System.out.println("\nPerson with ID 1:");
        Person person = DBConnection.getPersonbyId(1);
        System.out.println(person);

        // Step 6: Delete person
        DBConnection.deletePersonBYId(2);

        // Step 7: Close connection
        DBConnection.closeConnection();
    }
}
