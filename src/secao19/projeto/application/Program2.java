package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.DepartmentDao;
import secao19.projeto.model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: seller findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);
    }
}
