package DataHandeling;

import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;

public class EmployeeCsvReport {

    private static final String DB_URL  = "jdbc:mysql://localhost:3306/your_db";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "password";

    private static final String SQL = "SELECT employee_id, name, department, salary " + "FROM employees " + "ORDER BY employee_id";

    public static void main(String[] args) {
        Path outFile = Path.of("employees_report.csv");

        try {
            generateCsv(outFile);
            System.out.println("CSV generated: " + outFile.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generateCsv(Path outputFile) throws SQLException, IOException {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement ps = con.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery();
             BufferedWriter writer = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8)) {

            writer.write("Employee ID,Name,Department,Salary");
            writer.newLine();

            while (rs.next()) {
                int employeeId = rs.getInt("employee_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                BigDecimal salary = rs.getBigDecimal("salary");

                writer.write(employeeId + ","
                        + csv(name) + ","
                        + csv(department) + ","
                        + (salary == null ? "" : salary.toPlainString()));
                writer.newLine();
            }
        }
    }

    private static String csv(String value) {
        if (value == null) return "";
        boolean mustQuote = value.contains(",") || value.contains("\"") || value.contains("\n") || value.contains("\r");
        if (!mustQuote) return value;

        String escaped = value.replace("\"", "\"\"");
        return "\"" + escaped + "\"";
    }
}

