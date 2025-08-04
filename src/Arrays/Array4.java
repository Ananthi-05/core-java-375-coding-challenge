/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
class removeduplicate{
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
				
	}
	void display()
	{  System.out.print("The array elements without duplicate:");
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				System.out.print(ar[i]+" ");
			}
		}
}
}
public class Array4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		removeduplicate r1=new removeduplicate();
		r1.createarray();
		r1.collectdata();
		r1.display();

	}

}

