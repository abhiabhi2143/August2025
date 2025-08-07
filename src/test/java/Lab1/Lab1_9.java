package Lab1;
import java.util.*;
public class Lab1_9 {
	static Scanner sc=new Scanner(System.in);

	String add(String a, String b)
	{
		return a+b;
	}
	String odd(String a)
	{
		String b="";
		for(int i=0;i<a.length();i++)
		{
			if(i%2==1)
			{
				b+="#";
			}
			else
			{
				b+=a.charAt(i);
			}
		}
		return b;
	}
	String dup(String a)
	{
		String s=a;
		String b="";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int oc=0, bc=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					oc++;
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(c[i]==c[j])
				{
					bc++;
				}
			}
			if(oc<=1)
			{
				b+=c[i];
			}
		}
		return b;
		
	}
	String oddUpper(String a)
	{
		String b="";
		for(int i=0;i<a.length();i++)
		{
			if(i%2==1)
			{
				String c=""+a.charAt(i);
				c=c.toUpperCase();
				b+=c;
			}
			else
			{
				b+=a.charAt(i);
			}
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1_9 x=new Lab1_9();
		System.out.println(x.add("abhi", "ram"));
		System.out.println(x.odd("abhiram"));
		System.out.println(x.oddUpper("abhiram"));
		System.out.println(x.dup("apple"));

	}

}
