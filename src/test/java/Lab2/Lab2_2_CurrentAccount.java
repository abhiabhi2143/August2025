package Lab2;

public class Lab2_2_CurrentAccount  extends Lab2_2_Account{

	double overDraftLimit=1000;
	
	@Override
	void withdraw(double balance) {
		if (balance >= overDraftLimit) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
	}
}
