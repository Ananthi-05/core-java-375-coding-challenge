package java_Introduction_coding;

import java.util.Scanner;

public class areaandperiofcircle {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius:");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		double perimeter=2*Math.PI*r;
		System.out.println("Area:"+area);
		System.out.print("Perimeter:"+perimeter);
	}

}
