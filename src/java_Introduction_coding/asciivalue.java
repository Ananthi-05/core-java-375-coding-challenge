package java_Introduction_coding;
import java.util.Scanner;
public class asciivalue {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character:");
	    char ch=sc.next().charAt(0);
		
		int asciivalue=(int)ch;
		System.out.print("The Ascii value of"+ch+"is "+asciivalue);
	}

}
