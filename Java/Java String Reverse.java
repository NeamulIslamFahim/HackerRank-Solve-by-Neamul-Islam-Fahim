import java.io.*;
import java.util.*;

public class Solution {
    public static String reverseString(String s){  
    StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    return sb.toString();  
}  

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(Solution.reverseString(A).equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



