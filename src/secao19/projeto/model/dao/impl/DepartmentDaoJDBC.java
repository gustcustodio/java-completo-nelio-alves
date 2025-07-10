package secao19.projeto.model.dao.impl;

import secao19.db.DB;
import secao19.db.DbException;
import secao19.projeto.model.dao.DepartmentDao;
import secao19.projeto.model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection connection;

    public DepartmentDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO department "
                            + "(Name)"
                            + "VALUES "
                            + "(?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setString(1, obj.getName());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    obj.setId(id);

                    DB.closeResultSet(resultSet);
                } else {
                    throw new DbException("Unexpected error! No rows affected!");
                }
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT department.* FROM department "
                            + "WHERE department.Id = ?"
            );

            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return instantiateDepartment(resultSet);
            }

            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }

    private Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department department = new Department();
        department.setId(resultSet.getInt("Id"));
        department.setName(resultSet.getString("Name"));
        return department;
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(
                    "SELECT department.* FROM department "
                            + "ORDER BY department.Name"
            );

            resultSet = preparedStatement.executeQuery();

            List<Department> departments = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {
                Department dep = map.get(resultSet.getInt("Id"));

                if (dep == null) {
                    dep = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("Id"), dep);
                }

                departments.add(dep);
            }

            return departments;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeResultSet(resultSet);
        }
    }
}
