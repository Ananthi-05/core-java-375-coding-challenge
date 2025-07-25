package java_Introduction_coding;

import java.util.Scanner;

public class reversestring {
       public static void main(String[]args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   String str=sc.nextLine();
    	   StringBuilder sb=new StringBuilder(str);
    	   String res=sb.reverse().toString();
    	   System.out.print(res);
    	   
    	   
       }       
}
