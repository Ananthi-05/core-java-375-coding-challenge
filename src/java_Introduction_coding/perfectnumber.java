package java_Introduction_coding;

import java.util.Scanner;

public class perfectnumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		int factor=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				factor+=i;
			}
		}
		if(factor==n&&n!=0)
		{
			System.out.print("It is perfect number");
		}
		else
		{
			System.out.print("It is not a Perfect Number");
		}
	}

}
