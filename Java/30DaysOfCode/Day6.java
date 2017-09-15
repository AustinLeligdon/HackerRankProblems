import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
    public static void main(String[] args) {
        // Read in number of words
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        // Initalize all variables
        String[] words = new String[num];
        String even, odd, word;
        int i, j;
        
        // Scan in each word
        for(i=0; i<num; i++){
            words[i] = scan.next();
        }
        
        for(i=0; i<num; i++){
            // Get next word in array
            word = words[i];
            even = "";
            odd = "";
            
            // Seperate the word into even and odd characters
            for(j=0; j<word.length(); j++){
                if(j%2 == 0)
                    even += word.substring(j,j+1);
                else
                    odd += word.substring(j,j+1);
            }
            // Print out the parsed strings
            System.out.println(even + " " + odd);
        }
    }
}