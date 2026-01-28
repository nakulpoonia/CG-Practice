package LinkedList;

 class StudentLinkedList {


    private class Node {
        int rollNo;
        String name;
        int age;
        char grade;
        Node next;

        Node(int rollNo, String name, int age, char grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    private Node head;


    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        Node newNode = new Node(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int rollNo, String name, int age, char grade) {
        Node newNode = new Node(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }


    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Node newNode = new Node(rollNo, name, age, grade);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Student not found");
        else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }


    public void searchByRollNo(int rollNo) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }


    public void updateGrade(int rollNo, char newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }


    public void displayAll() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        Node temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }


    private void displayStudent(Node s) {
        System.out.println(
                "Roll No: " + s.rollNo +
                        ", Name: " + s.name +
                        ", Age: " + s.age +
                        ", Grade: " + s.grade
        );
    }
}


public class StudentManagment {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Riya", 21, 'B');
        list.addAtPosition(2, 3, "Kunal", 19, 'A');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearch Roll No 2:");
        list.searchByRollNo(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(2, 'A');

        System.out.println("\nDelete Roll No 1:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal List:");
        list.displayAll();
    }
}
