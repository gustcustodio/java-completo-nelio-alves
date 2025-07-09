package secao19.projeto.application;

import secao19.projeto.model.entities.Department;
import secao19.projeto.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(21,
                "Bob",
                "bob@gmail.com",
                new Date(),
                3000.0,
                department);
        System.out.println(seller);
    }
}
