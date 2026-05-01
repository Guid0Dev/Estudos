package application;

import java.util.Date;
import java.util.List;
import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: sellerById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("=== Test 2: sellerFindByDepartment ===");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== Test 3: seller findAll ===");
        list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);

        System.out.println("=== Test 3: seller findAll ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);

        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        }
    }
}
