package Lab1;
import java.util.Scanner;
public class Lab1_7 {
	static Scanner sc=new Scanner(System.in);
	
	String fn;
	String ln;
	String gender;
	String ph;
	Lab1_7()
	{
		
	}
	Lab1_7(String fn,String ln,String gender){
		super();
		this.fn=fn;
		this.ln=ln;
		this.gender=gender;
	}
	void setPh(String phno)
	{
		this.ph=phno;
	}
	String getPh()
	{
		return ph;
	}
	String getFN()
	{
		return fn;
	}
	String getLN()
	{
		return ln;
	}
	String getGender()
	{
		return gender;
	}
	void dis()
	{
		System.out.println("firstName is "+getFN());
		System.out.println("lastName is "+getLN());
		System.out.println("gender is "+getGender());
		System.out.println("phone number is "+getPh());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1_7 x=new Lab1_7("abhiram","kondeti","male");
		x.setPh("9550626527");
		x.dis();
	}

}