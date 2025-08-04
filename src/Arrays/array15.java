package Arrays;
import java.util.Scanner;

class indexarray {
    int[] arr;
    int n,s;
    Scanner sc = new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the element to search index:");
        s=sc.nextInt();
    }
    void collectData() {
        System.out.println("Enter"+ n +"elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    void findindex() {
   
        for(int i=0;i<n;i++)
        {
        	if(arr[i]==s)
        	{
        		System.out.println("The index of the element is:"+i);
        	}
        }
}
}
public class array15 {
    public static void main(String[] args) {
    	indexarray in= new indexarray();
        in.create();
        in.collectData();
        in.findindex();
    }
}


