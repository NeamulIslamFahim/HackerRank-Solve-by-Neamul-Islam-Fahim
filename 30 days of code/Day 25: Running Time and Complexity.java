package problem;

import java.io.*;
import java.util.*;

public class Solution {

    public static void Prime(int n) {

        if (n == 1) {
            System.out.println("Not prime");
            return;
        }
        if (n == 2) {
            System.out.println("Prime");
            return;
        }

        if (n % 2 == 0) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
            i++;
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        while (T-- > 0) {
            int number = in.nextInt();
            Prime(number);
        }

    }

}
