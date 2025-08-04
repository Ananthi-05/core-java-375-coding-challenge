/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
class Copyarray{
	Scanner sc=new Scanner(System.in);
	int ar[];
	int n;
	int ar1[];
	void createarray()
	{
		System.out.println("Enter the array size");
		 n=sc.nextInt();
		ar=new int[n];	
		ar1=new int[n];
	}
	void collectdata()
	{
		System.out.print("enter the elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
				
	}
	void copydata()
	{   
		for(int i=0;i<ar.length;i++)
		{
			ar1[i]=ar[i];
		}	
	}
	void display()
	{  System.out.print("The new array elements are:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar1[i]);
		}
	}
}
public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyarray c1=new Copyarray();
		c1.createarray();
		c1.collectdata();
		c1.copydata();
		c1.display();

	}

}
