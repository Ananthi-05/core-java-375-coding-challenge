package java_Introduction_coding;

import java.util.Scanner;

public class gcd13 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b=sc.nextInt();
		int temp=0;
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.print(a);
	}

}
