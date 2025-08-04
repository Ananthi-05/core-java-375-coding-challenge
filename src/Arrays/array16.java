package Arrays;
import java.util.Scanner;

class RotateRightArray {
    int[] arr;
    int n;
    Scanner sc = new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
    }
    void collectData() {
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    void rotateRight() {
        int last=arr[n-1];
        for (int i=n-1;i>0;i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    void display() {
        System.out.println("Array after right rotation:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
public class array16 {
    public static void main(String[] args) {
        RotateRightArray rra = new RotateRightArray();
        rra.create();
        rra.collectData();
        rra.rotateRight();  
        rra.display();
    }
}


