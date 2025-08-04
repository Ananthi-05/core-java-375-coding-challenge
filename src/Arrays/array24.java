package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class KthElement {
    int[] arr;
    int n,k;
    Scanner sc=new Scanner(System.in);

    void collectData() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        k=sc.nextInt();
    }
    void findKthElements() {
        if (k>0&&k<=n) {
            Arrays.sort(arr); 
            int kthSmallest = arr[k - 1];
            int kthLargest = arr[n - k];
            System.out.println("Sorted array: " +Arrays.toString(arr));
            System.out.println("Kth smallest element is: " +kthSmallest);
            System.out.println("Kth largest element is: " +kthLargest);
        } else {
            System.out.println("Invalid value of k. It must be between 1 and " +n);
        }
    }
}
public class array24 {
    public static void main(String[] args) {
        KthElement ke = new KthElement();
        ke.collectData();
        ke.findKthElements();
    }
}

