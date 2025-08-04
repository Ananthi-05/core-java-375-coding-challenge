package Arrays;
import java.util.Scanner;

class NegativeSumArray {
    int[] arr;
    int n;
    Scanner sc=new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
    }
    void collectData() {
        System.out.println("Enter " +n+ " elements(positive or negative):");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    void displayNegativeSum() {
        int sum=0;
        for (int i=0;i<n;i++) {
            if (arr[i]<0) {
                sum+=arr[i];
            }
        }
        System.out.println("Sum of all negative numbers in the array: " +sum);
    }
}
public class array12 {
    public static void main(String[] args) {
        NegativeSumArray ns = new NegativeSumArray();
        ns.create();
        ns.collectData();
        ns.displayNegativeSum();
    }
}


