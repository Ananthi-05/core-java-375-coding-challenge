/**
 * @author Ananthi
 * @description Arrays concepts
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  description Sum of array elements
 */
class Largestelement{
	Scanner sc=new Scanner(System.in);
	int ar[];
	int n;
	void createarray()
	{
		System.out.println("Enter the array size");
		 n=sc.nextInt();
		ar=new int[n];	
	}
	void collectdata()
	{
		System.out.print("enter the elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
				
	}
	void display()
	{   
		
		System.out.println("Smallest element in an array:"+ar[0]);
		System.out.print("Largest element in an array:"+ar[n-1]);
		
	}
}
public class Array2 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largestelement l1=new Largestelement();
		l1.createarray();
		l1.collectdata();
		l1.display();

	}

}
