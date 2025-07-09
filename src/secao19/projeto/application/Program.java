package secao19.projeto.application;

import secao19.projeto.model.dao.DaoFactory;
import secao19.projeto.model.dao.SellerDao;
import secao19.projeto.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
