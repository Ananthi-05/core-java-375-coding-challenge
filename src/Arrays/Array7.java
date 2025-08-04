/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
class Frequency
{
	Scanner sc=new Scanner(System.in);
	int ar[];
	int n;
    boolean visited[] ;
	void createarray()
	{
		System.out.println("Enter the array size");
		 n=sc.nextInt();
		ar=new int[n];	
		  visited = new boolean[n];
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
	void freq() 
	{
	System.out.println("Frequency of each element:");
	 
    for (int i = 0; i < ar.length; i++) {
        if (visited[i] == true)
            continue;
        int count=1;
        for (int j =i+1;j<n;j++) {
            if (ar[i]==ar[j]) {
                count++;
                visited[j] = true;
            }
        }
        System.out.println(ar[i] + " occurs " + count + " times");
    }
    }	
}
public class Array7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frequency f1=new Frequency();
		f1.createarray();
		f1.collectdata();
		f1.freq();

	}

}
