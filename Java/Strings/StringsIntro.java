import java.io.*;
import java.util.*;

/*
Given two strings of lowercase English letters,  and , perform the following operations:

1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/

public class StringsIntro {
    public static void main(String[] args) {
        //Scan in the two words
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //Calculate sums (1)
        int sum = A.length() + B.length();
        String lex, capitals;
        
        //Compare values (2)
        if(A.compareTo(B) > 0)
            lex = "Yes";
        else
            lex = "No";
        
        //Capitalize the words (3)
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        capitals = A + " " + B;
        
        //Print outputs
        System.out.println(sum);
        System.out.println(lex);
        System.out.println(capitals);
    }
}