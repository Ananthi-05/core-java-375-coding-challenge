package Arrays;
import java.util.Scanner;

class MinMaxArray {
    int[] arr;
    int n;
    Scanner sc = new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
    }
    void collectData() {
        System.out.println("Enter"+ n +"elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    void findMinMax() {
        int min=arr[0];
        int max=arr[0];
        for (int i=1;i<n;i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Smallest element in the array:"+min);
        System.out.println("Largest element in the array:"+max);
    }
}
public class array14 {
    public static void main(String[] args) {
        MinMaxArray mm = new MinMaxArray();
        mm.create();
        mm.collectData();
        mm.findMinMax();
    }
}

