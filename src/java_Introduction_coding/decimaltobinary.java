package java_Introduction_coding;
import java.util.Scanner;
public class decimaltobinary {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Decimal value:");
	int n=sc.nextInt();
	String binary=Integer.toBinaryString(n);
	System.out.print("Binary Value:"+binary);
	}

}
