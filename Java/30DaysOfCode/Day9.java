import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Basic recursive function

public class Day9 {
    static int factorial(int n) {
        if(n==1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
