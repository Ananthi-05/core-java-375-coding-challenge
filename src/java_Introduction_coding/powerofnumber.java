package java_Introduction_coding;

import java.util.Scanner;

public class powerofnumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		System.out.print(res);
	}
	

}
