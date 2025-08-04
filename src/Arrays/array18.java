package Arrays;
import java.util.Scanner;

class ArrayEquality {
    int[] arr1,arr2;
    int n1,n2;
    Scanner sc=new Scanner(System.in);
    void create() {
        System.out.print("Enter size of first array: ");
        n1=sc.nextInt();
        arr1=new int[n1];
        System.out.print("Enter size of second array: ");
        n2=sc.nextInt();
        arr2=new int[n2];
    }
    void collectData() {
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter" + n2 + " elements for second array:");
        for (int i=0;i<n2;i++) {
            arr2[i] = sc.nextInt();
        }
    }
    void checkEquality() {
        if (n1!=n2) {
            System.out.println("Arrays are not equal (different sizes).");
            return;
        }
        for (int i=0;i<n1;i++) {
            if (arr1[i]!=arr2[i]) {
                System.out.println("Arrays are not equal.");
                return;
            }
        }

        System.out.println("Arrays are equal.");
    }
}
public class array18 {
    public static void main(String[] args) {
        ArrayEquality ae = new ArrayEquality();
        ae.create();
        ae.collectData();
        ae.checkEquality();
    }
}
