package Arrays;
import java.util.Scanner;

class Product {
    int[] arr;
    int n;
    Scanner sc=new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
    }
    void collectData() {
        System.out.println("Enter"+n+ "elements:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    void displayNegativeSum() {
        int sum = 1;
        for (int i=0;i<n;i++) {
                sum*=arr[i];
            
        }
        System.out.println("Product of all numbers in the array: " +sum);
    }
}
public class array13 {
    public static void main(String[] args) {
    	Product p1 = new Product();
        p1.create();
        p1.collectData();
        p1.displayNegativeSum();
    }
}

