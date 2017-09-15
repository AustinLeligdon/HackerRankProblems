import java.util.Scanner;
import java.util.regex.*;

/**
The first line of input contains an integer , denoting the number of test cases.
The next  lines contain a string of any printable characters representing the pattern of a regex.
Print valid or invalid based on if it is a regex pattern.
 */

public class PatternSyntaxChecker {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      while(testCases>0){
        String pattern = in.nextLine();
         
        // Try to match the pattern
        try{
            Pattern.compile(pattern);
            System.out.println("Valid");
        }
        // If no match is found it is not valid regex
        catch (PatternSyntaxException e){
            System.out.println("Invalid");
        }
      }
   }
}