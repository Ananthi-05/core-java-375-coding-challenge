package java_Introduction_coding;

import java.util.Scanner;

public class multipytable {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the table number:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+n+"="+i*n);
		}
	}


}
