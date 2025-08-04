package Arrays;
import java.util.Scanner;
class PalindromeArray {
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
            arr[i]=sc.nextInt();
        }
    }
    void checkPalindrome() {
        boolean isPalindrome = true;
        for (int i=0;i<n/2;i++) {
            if (arr[i]!=arr[n-1-i]) {
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
public class array10 {
    public static void main(String[] args) {
        PalindromeArray pa = new PalindromeArray();
        pa.create();
        pa.collectData();
        pa.checkPalindrome();
    }
}

