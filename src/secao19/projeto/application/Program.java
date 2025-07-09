package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.SellerDao;
import secao19.projeto.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}
