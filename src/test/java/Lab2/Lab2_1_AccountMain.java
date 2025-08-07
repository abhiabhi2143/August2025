package Lab2;

public class Lab2_1_AccountMain {

	public static void main(String[] args) {

		Lab2_1_Person Smith = new Lab2_1_Person();
		Lab2_1_Person Kathy = new Lab2_1_Person();

		Smith.setBalance(2000);
		Kathy.setBalance(3000);

		System.out.println("Smith balance: " + Smith.getBalance());
		System.out.println("Kathy balance: " + Kathy.getBalance());

		System.out.println("Smith Deposite: ");
		Smith.deposite(3000);
		System.out.println("Kathy Deposite: ");
		Kathy.withdraw(2000);

		System.out.println("Balance after deposite of Smith");
		System.out.println(Smith.getDepositedBalance());
		System.out.println("Balance after withdraw of Kathy");
		System.out.println(Kathy.getBalance());

	}
}
