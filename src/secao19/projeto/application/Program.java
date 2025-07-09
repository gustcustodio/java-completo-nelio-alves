package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.SellerDao;
import secao19.projeto.model.entities.Department;
import secao19.projeto.model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

    }
}
