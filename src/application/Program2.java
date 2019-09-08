package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Cria conexão BD
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		for (Department deplist : list) {
			System.out.println(deplist);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		System.out.println();
		System.out.println("=== TEST 4: department update ===");
		dep = departmentDao.findById(6);
		dep.setName("Biblioteca");
		departmentDao.update(dep);
		System.out.println("Update completed!");

		
		sc.close();
	}

}
