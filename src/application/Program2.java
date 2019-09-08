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

		
		sc.close();
	}

}
