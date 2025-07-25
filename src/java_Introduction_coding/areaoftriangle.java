package java_Introduction_coding;

import java.util.Scanner;

public class areaoftriangle {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int height=sc.nextInt();
		float area=((float)base*(float)height)/2;
		System.out.println(area);
	}

}
