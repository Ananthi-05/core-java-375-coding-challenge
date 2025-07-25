package java_Introduction_coding;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[]args)
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number:");
			int n=sc.nextInt();
			int original=n;
			int digit=0;
			int q=0;
			while(n>0)
			{
				digit=n%10;
				 q=q+digit*digit*digit;
				n=n/10;
				
			}
			if(q==original)
			{
				System.out.print("It is armstrong number");
			}
			else
			{
				System.out.print("It is not a Armstrong Number");
			}
		}
	}


