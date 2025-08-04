package Arrays;
import java.util.Scanner;
class ArrayIntersection {
    int n1,n2;
    int[] arr1;
    int[] arr2;
    Scanner sc = new Scanner(System.in);
    void create() {
        System.out.print("Enter size of first array: ");
        n1=sc.nextInt();
        arr1=new int[n1];
        System.out.print("Enter size of second array: ");
        n2=sc.nextInt();
        arr2=new int[n2];
    }
    void collectData() {
        System.out.println("Enter " +n1+ " elements for first array:");
        for (int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }
       System.out.println("Enter " +n2+ " elements for second array:");
        for (int i=0;i<n2;i++) {
            arr2[i]=sc.nextInt();
        }
    }
    void displayIntersection() {
        System.out.println("Intersection of the two arrays:");
        for (int i=0;i<n1;i++) {
            for (int j=0;j<n2;j++) {
                if (arr1[i]==arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    break; 
                }
            }
        }
        System.out.println();
    }
}
public class array9 {

	public static void main(String[] args) {
		ArrayIntersection ai = new ArrayIntersection();
        ai.create();
        ai.collectData();
        ai.displayIntersection();
	}

}
