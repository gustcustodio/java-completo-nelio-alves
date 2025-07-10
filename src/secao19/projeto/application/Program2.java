package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.DepartmentDao;
import secao19.projeto.model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        /*
        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Furniture");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
         */

        /*
        System.out.println("\n=== TEST 4: department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
         */

        System.out.println("\n=== TEST 5: department update ===");
        department = departmentDao.findById(3);
        department.setName("Shoes");
        departmentDao.update(department);
    }
}
