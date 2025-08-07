package Lab2;

public class Lab2_2_AccountMain {

	public static void main(String[] args) {
		
	
	Lab2_2_Account checkBalance = new Lab2_2_CurrentAccount();
	
	
	checkBalance.setBalance(3000);
	checkBalance.withdraw(2000);
	
	System.out.println(checkBalance.getBalance());
	
	System.out.println("------------------");
	
	checkBalance.withdraw(12000);
	
	
	}
	
}
