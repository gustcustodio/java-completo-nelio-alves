package secao19.projeto.model.dao;

import secao19.projeto.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();
}
