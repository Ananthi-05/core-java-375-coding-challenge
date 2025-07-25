package java_Introduction_coding;

import java.util.Scanner;

public class quadraticequation {
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 double a=sc.nextInt();
	 double b=sc.nextInt();
	 double c=sc.nextInt();
	 double deter=b*b-4*a*c;
	 if(deter>0)
	 {
		 double r1=(-b+Math.sqrt(deter))/(2*a);
		 double r2=(-b-Math.sqrt(deter))/(2*a);
		 System.out.println("root1"+r1);
		 System.out.print("root2"+r2);
		 
		 
	 }
	 else if(deter==0)
	 {
		 double r=b/(2*a);
		 System.out.print("one real root"+r);
	 }
	 else
	 {
		 double real=-b/(2*a);
		 double img=Math.sqrt(-deter)/(2*a);
		 System.out.println("Real "+real);
		 System.out.print("imaginary "+img);
	 }
 }
}
