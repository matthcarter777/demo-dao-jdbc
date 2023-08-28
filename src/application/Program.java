package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== Test 1: Seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== Test 2: Seller findByDepartment ===");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== Test 3: Seller findByDepartment ===");
				
		List<Seller> allSellers = sellerDao.findAll();
		
		for (Seller obj: allSellers) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Test 4: Seller insert ===");
		
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		
		//sellerDao.insert(newSeller);
		
		//System.out.println("Inserted! new Id: " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== Test 5: Seller findById ===");
		
		Seller sellerUpdate = sellerDao.findById(8);
		System.out.println(sellerUpdate);
		System.out.println();
		
		sellerUpdate.setName("Vegeta");
		sellerDao.update(sellerUpdate);
		
		Seller sellerUpdated = sellerDao.findById(8);
		
		System.out.println(sellerUpdated);
		
		System.out.println();
		

		System.out.println("=== Test 7: Seller DeleteById ===");
		System.out.println();		

		sellerDao.deleteById(10);
		
		System.out.println(sellerUpdated);
				
		System.out.println("Seller deleted");
		
		System.out.println();
		System.out.println("=== Test 8: Department insert ===");
		
		Department newDepartment = new Department(null, "Putaria");
		
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! new Id: " + newDepartment.getId());
		
		System.out.println();
		System.out.println("=== Test 9: Department findById ===");
		
		Department findDepartment = departmentDao.findById(6);
		System.out.println(findDepartment);
		
		
		
	}

}
