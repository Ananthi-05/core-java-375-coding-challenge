package Arrays;
import java.util.Scanner;
class CountNumbers {
    int[] arr;
    int n;
    int positive=0,negative=0,zero=0;
    Scanner sc=new Scanner(System.in);
    void create() {
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        arr=new int[n];
    }
    void collectData() {
        System.out.println("Enter " + n + "elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
    }
    void countNumbers() {
        for(int i=0;i<n;i++) {
             if (arr[i]>0)
                positive++;
            else if(arr[i]<0)
                negative++;
            else
                zero++;
        }
        System.out.println("Number of Positive elements: " +positive);
        System.out.println("Number of Negative elements: " +negative);
        System.out.println("Number of Zero elements: " +zero);
    }
}
public class array25 {
    public static void main(String[] args) {
        CountNumbers cn = new CountNumbers();
        cn.create();
        cn.collectData();
        cn.countNumbers();
    }
}


