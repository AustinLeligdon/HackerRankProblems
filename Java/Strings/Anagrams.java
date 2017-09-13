import java.io.*;
import java.util.*;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String letter;
        int counta = 0, countb = 0;
        boolean anagram = true;
        
        // If the words are not the saem length they cannot be anagrams
        if(a.length() != b.length())
            return false;
        
        for(int i=0; i<a.length(); i++){
            // Get next letter from a
            counta = 0; countb = 0;
            letter = a.substring(i, i+1).toUpperCase();
            
            // Loop through a and count the times that letter appears
            for(int j=0; j<a.length(); j++){
                if(letter.equals(a.substring(j, j+1).toUpperCase()))
                    counta ++;
            }
            // Loop through b and count the times that letter appears
            for(int k=0; k<b.length(); k++){
                if(letter.equals(b.substring(k, k+1).toUpperCase()))
                    countb ++;
            }
            // If the counts arent eqaul then its not an anagram
            if(counta != countb){
                anagram = false;
                break;
            }
        }
        
        return anagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}