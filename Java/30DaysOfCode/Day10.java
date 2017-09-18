import java.io.*;
import java.util.*;

/**
Convert the input number to binary. Then count and print the total consecutive 1's. 
 */
public class Day10 {
    public static void main(String[] args) {
        // Read in the number
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();

        // Initalize variables
        int i, max=0, current=0;
        boolean consec = false;
        
        // Convert to binary and iterate through the string
        String binary = num.toBinaryString(num);
        for(i=0; i<binary.length(); i++){
            // If the number is a 1 then add one to the count and mark consecutive as true
            if(binary.substring(i, i+1).equals("1")){
                consec=true;
                current ++;
            }else{
                // Otherwise there are not consecutive 1's. Check if the current was greater than
                //  the max value and reset
                consec=false;
                if(current > max)
                    max = current;
                current = 0;
            }
        }
        // If there are no 0's in the binary num, set to max
        if(current > max)
            max = current;

        // Print the max number of consecutive 1's
        System.out.println(max);
    }
}