import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i, j, intN, intK;
        String binaryN, binaryK;
        
        for(i=0; i<num; i++){
            intN = scan.nextInt();
            intK = scan.nextInt();
            
            binaryN = Integer.toBinaryString(intN);
            binaryK = Integer.toBinaryString(intK);
            
            System.out.println(binaryN);
            System.out.println(binaryK);
            
            //for(j)...
        }
    }
}