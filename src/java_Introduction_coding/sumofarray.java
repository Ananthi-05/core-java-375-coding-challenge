package java_Introduction_coding;

import java.util.Scanner;

public class sumofarray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  number:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the  array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			 sum+=arr[i];
		}
		System.out.print("Sum of array "+sum);
	}

}
