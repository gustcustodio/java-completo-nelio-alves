package secao19.aula212;

import secao19.db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Aula212 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DB.getConnection();
            /*
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentID) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setString(1, "Tanjiro K");
            preparedStatement.setString(2, "tanjiro@email.com");
            preparedStatement.setDate(3,
                    new Date(simpleDateFormat.parse("22/04/1985").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);
            */

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO department (Name) VALUES ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS
            );

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id: " + id);
                }

            } else {
                System.out.print("No rows affected!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
