package Lab2;

public class Lab2_2_Account {

	long accNum;
	double balance;
	Lab2_1_Person accHolder;

	double depositeBalance = 0;
	double withdrawbalance;

	void deposite(double balance) {
		if (balance >= 0) {
			depositeBalance = balance;
			System.out.println(depositeBalance);
		} else {
			System.out.println("please enter valid value");
		}
	}

	void withdraw(double balance) {
		if (balance >= 0) {
			withdrawbalance = balance;
			System.out.println(withdrawbalance);
		} else {
			System.out.println("please enter valid value");
		}
	}

	double getDepositedBalance() {
		return (balance + depositeBalance);
	}

	double getBalance() {
		return (balance - withdrawbalance);
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Lab2_1_Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Lab2_1_Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
