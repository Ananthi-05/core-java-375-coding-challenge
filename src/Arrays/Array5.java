/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
class reversearray
{
	Scanner sc=new Scanner(System.in);
	int a[];
	void createarray()
	{
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		a=new int[n];
	}
	void collectdata()
	{
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println(" the  reversed array elements:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class Array5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reversearray r1=new reversearray();
		r1.createarray();
		r1.collectdata();
		r1.display();

	}

}
