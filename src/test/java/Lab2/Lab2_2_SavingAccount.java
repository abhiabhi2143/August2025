package Lab2;
public class Lab2_2_SavingAccount extends Lab2_2_Account{

	final double minBalance = 0;
	
	@Override
	void withdraw(double balance) {
		
		if (balance >= 0) {
			withdrawbalance = balance;
			System.out.println(withdrawbalance);
		} else {
			System.out.println("Your minimum balance is : "+ balance);
		}
	}
}
