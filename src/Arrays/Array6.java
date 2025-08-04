/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
class ascanddesc{
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
	void ascdisplay()
	{   
		System.out.println("The ascending order of array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	void dscdisplay()
	{   
		System.out.println("The descending order of array:");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	
}
public class Array6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ascanddesc a1=new ascanddesc();
		a1.createarray();
		a1.collectdata();
		a1.ascdisplay();
		a1.dscdisplay();
		

	}

}
