package Arrays;
import java.util.Scanner;

class PositiveSumArray {
    int[] arr;
    int n;
    Scanner sc=new Scanner(System.in);

    // Method to create array
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
    }

    // Method to collect array data
    void collectData() {
        System.out.println("Enter " +n+ "elements (positive or negative):");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    void displayPositiveSum() {
        int sum=0;
        for (int i=0;i<n;i++) {
            if (arr[i]>0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of all positive numbers in the array: " + sum);
    }
}
public class array11 {
    public static void main(String[] args) {
        PositiveSumArray ps = new PositiveSumArray();
        ps.create();
        ps.collectData();
        ps.displayPositiveSum();
    }
}

