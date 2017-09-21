import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Read in two numbers and use Java's BigInteger class to calculate the results

public class BigInteger {
    public static void main(String[] args) {
        // Initalize
        Scanner in = new Scanner(System.in);
        BigInteger a, b, add, mult;
        
        // Read input and create BigInteger variables
        a = new BigInteger(in.next());
        b = new BigInteger(in.next());
        
        // Use the add and multiply methods for the BigInteger class
        add = a.add(b);
        mult = a.multiply(b);
        
        // Print the results
        System.out.println(add +"\n"+ mult);
    }
}