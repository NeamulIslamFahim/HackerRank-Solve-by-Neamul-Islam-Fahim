import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int d1 = in.nextInt();
       int m1 = in.nextInt();
       int y1 = in.nextInt();
       int d2 = in.nextInt();
       int m2 = in.nextInt();
       int y2 = in.nextInt();
       
       if(d1==d2 && m1==m2 && y1==y2) {
           System.out.println("No Fine");
       }
       else if(d1!=d2 && m1==m2 && y1==y2) {
           System.out.println(15*(d1-d2));
       }
       else if(d1==d2 && m1!=m2 && y1==y2) {
           System.out.println(500*(m1-m2));
       }
       else{
           System.out.println("100000");
       }
    }
}
