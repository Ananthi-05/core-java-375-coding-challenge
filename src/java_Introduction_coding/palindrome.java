package java_Introduction_coding;

import java.util.Scanner;

public class palindrome {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		String res=sb.reverse().toString();
		if(s.equals(res))
		{
			System.out.println(s+" is a Palindrome");
		}
		else
		{
			System.out.println(s+" is not a Palindrome");
		}
	}

}
