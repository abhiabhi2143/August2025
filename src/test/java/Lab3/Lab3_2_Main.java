package Lab3;
import java.util.*;
public class Lab3_2_Main{
	
	static Scanner sc=new Scanner(System.in);
	long an;
	String name;
	double bal;
	double ib;
	Lab3_2_Main(String name,double ib)
	{
		this.name=name;
		this.an=1000;
		an++;
		this.bal=ib;
	}
	void deposit(double amount)
	{
		bal=bal+amount;
	}
	void withdraw(double amount)
	{
		bal=bal-amount;
	}
	void balance()
	{
		System.out.println("Your balance is "+bal);
	}
	public static void main(String[] args) throws Lab3_2_ValidAgeException {
		// TODO Auto-generated method stub
		
		Lab3_2_Person x=new Lab3_2_Person("smith", 22);
		Lab3_2_Main x1=new Lab3_2_Main("SMITH", 2000);
		
		x1.deposit(2000);
		x1.balance();
		Lab3_2_Person y=new Lab3_2_Person("kathy", 14);
		Lab3_2_Main y1=new Lab3_2_Main("kathy", 3000);
		y1.withdraw(2000);
		y1.balance();	
	}

}