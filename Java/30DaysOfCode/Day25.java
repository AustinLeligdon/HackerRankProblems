import java.io.*;
import java.util.*;

public class Day25 {
    public static void main(String[] args) {
        // Set up scanner
        Scanner scan = new Scanner(System.in);
        int numTests = scan.nextInt();

        // Initalize variables
        int i, j, curNum, sqrt;
        
        // Determine value by value, dont save previous
        for(i=0; i < numTests; i++){
            // Get next value
            curNum = scan.nextInt();
            sqrt = (int)Math.sqrt(curNum);
            
            // Check for divisible numbers less than its square root
            for(j=2; j <= sqrt; j++){
                if(curNum % j == 0){
                    // Set to 1 if not prime to reduce code
                    curNum = 1;
                    break;
                }
            }
            
            // Print
            if(curNum == 1)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
        }
    }
}