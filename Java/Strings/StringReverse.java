import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next(), a, b;
        boolean palindrome = true;
        
        for(int i=0; i<A.length()/2; i++){
            a = A.substring(i,i+1);
            b = A.substring(A.length()-1-i, A.length()-i);
            
            // Must check with .equals // == checks for the same object
            if(!a.equals(b)){
                palindrome = false;
                break;
            }
        }
        if(palindrome)
            System.out.println("Yes");
        else
            System.out.println("No");
           
    }
}
