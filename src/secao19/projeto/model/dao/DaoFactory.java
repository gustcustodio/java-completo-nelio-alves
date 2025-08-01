package secao19.projeto.model.dao;

import secao19.db.DB;
import secao19.projeto.model.dao.impl.DepartmentDaoJDBC;
import secao19.projeto.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
