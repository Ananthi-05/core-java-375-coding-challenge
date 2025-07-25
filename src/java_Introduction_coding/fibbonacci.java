package java_Introduction_coding;

import java.util.Scanner;

public class fibbonacci {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		
		for(int i=0;i<n;i++)
		{  
			System.out.print(first+" ");
			
			int res=first+second;
			first=second;
			second=res;
		
		}
		
		
	}

}
