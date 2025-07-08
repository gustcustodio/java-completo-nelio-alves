package secao19.aula214;

import secao19.db.DB;
import secao19.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aula214 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?"
            );

            preparedStatement.setInt(1, 5);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
