package Lab3;

import java.util.*;
public class Lab3_4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("how many products do you want to store");
		int n=sc.nextInt();
		String pN[]=new String[n];
		for(int i=0;i<n;i++)
		{
			pN[i]=sc.next();
		}
		Arrays.sort(pN);
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" "+pN[i]);
		}
		
	}

}
