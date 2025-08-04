package Arrays;
import java.util.*;
class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first sorted list
        System.out.print("Enter the number of elements in first sorted list: ");
        int n1 = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i=0;i<n1;i++) {
            list1.add(sc.nextInt());
        }
        System.out.print("Enter the number of elements in second sorted list: ");
        int n2=sc.nextInt();
        List<Integer>list2=new ArrayList<>();
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i=0;i<n2;i++) {
            list2.add(sc.nextInt());
        }
        List<Integer>merged=new ArrayList<>();
        int i=0,j=0;
        while (i<n1&&j<n2) {
            if (list1.get(i)<=list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        while (i<n1) {
            merged.add(list1.get(i));
            i++;
        }
        while (j<n2) {
            merged.add(list2.get(j));
            j++;
        }
        System.out.println("Merged Sorted List:");
        for (int num:merged) {
            System.out.print(num + " ");
        }
    }
}
