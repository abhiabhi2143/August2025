package Lab3;
import java.util.*;
public class Lab3_1_Main{
	static Scanner sc=new Scanner(System.in);
	void isValid(String firstN, String lastN) throws Lab3_1_ValidNameException
	{
		if(firstN.isEmpty() || lastN.isEmpty())
		{
			throw new Lab3_1_ValidNameException("Invalid Name");
		}
		else
		{
			System.out.println("VALID NAME");
		}
		
	}
	public static void main(String[] args) throws Lab3_1_ValidNameException{
		// TODO Auto-generated method stub
		String firstN="abhi";
		String lastN="";
		new Lab3_1_Main().isValid(firstN, lastN);
	}

}
