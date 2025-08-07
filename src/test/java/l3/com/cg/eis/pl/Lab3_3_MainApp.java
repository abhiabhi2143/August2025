package l3.com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

import l3.com.cg.eis.bean.Lab3_3_Employee;
import l3.com.cg.eis.service.EmployeeService;
import l3.com.cg.eis.service.EmployeeServiceImpl;



public class Lab3_3_MainApp {

	 public static void main(String[] args) throws EmployeeException{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume leftover newline

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine(); // consume leftover newline

	        System.out.print("Enter Designation (Manager/Programmer/Clerk): ");
	        String designation = sc.nextLine();

	       
	        Lab3_3_Employee emp = new Lab3_3_Employee(id, name, salary, designation);

	        EmployeeService service =  new EmployeeServiceImpl();
	        service.getScheme(emp);

	        System.out.println("\n" + emp);
	    }
}

