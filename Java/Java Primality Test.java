
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean x;

        String n = bufferedReader.readLine();
        BigInteger a = new BigInteger(n);
        if (x = a.isProbablePrime(1)) {
            System.out.println("prime");
        } else if (x = a.isProbablePrime(0)) {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
