package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.SellerDao;
import secao19.projeto.model.entities.Department;
import secao19.projeto.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        /*
        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(
                null,
                "Greg",
                "greg@email.com",
                new Date(),
                4000.0,
                department
        );
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
         */

        /*
        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(7);
        seller.setName("Tanjiro Kamado");
        sellerDao.update(seller);
        System.out.println("Update completed");
         */

        System.out.println("\n=== TEST 6: seller delete ===");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        sellerDao.deleteById(id);
    }
}
