
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
