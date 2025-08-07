package l3.com.cg.eis.service;

import l3.com.cg.eis.bean.Lab3_3_Employee;

public class EmployeeServiceImpl implements EmployeeService{

	  @Override
	    public void getScheme(Lab3_3_Employee emp) {
	        double salary = emp.getSalary();
	        String designation = emp.getDesignation().toLowerCase();

	        if (salary >= 50000 && designation.equals("manager")) {
	            emp.setInsuranceScheme("Scheme A");
	        } else if (salary >= 20000 && salary < 50000 && designation.equals("programmer")) {
	            emp.setInsuranceScheme("Scheme B");
	        } else if (salary >= 5000 && salary < 20000 && designation.equals("clerk")) {
	            emp.setInsuranceScheme("Scheme C");
	        } else {
	            emp.setInsuranceScheme("No Scheme");
	        }
	    }
}
