package java_Introduction_coding;

import java.util.Scanner;

public class isprime {
	static boolean checkprime(int n) {
	
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%2==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		if(checkprime(n))
		{
			System.out.println("It is prime");
		}
		else
		{
			System.out.println("It is not a prime");
		}
		
	}

}
