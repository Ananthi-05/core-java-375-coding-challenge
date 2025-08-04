/**
 * @author Ananthi
 * @description Arrays concepts
 */
package Arrays;

import java.util.Scanner;
class Sumofarray{
	Scanner sc=new Scanner(System.in);
	int ar[];
	void createarray()
	{
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		ar=new int[n];	
	}
	void collectdata()
	{
		System.out.print("enter the elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
				
	}
	void sum()
	{   
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{  
			sum+=ar[i];
		}
		System.out.println("Sum of elements in array:"+sum);
	}
}
public class Array1 {

	/**
	 * @param args
	 * description Sum of array elements
	 */
	public static void main(String[] args) {
     	Sumofarray a1=new Sumofarray();
		a1.createarray();
		a1.collectdata();
		a1.sum();
		
		
	}

}
