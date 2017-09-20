import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int i, j, curSum, max;
        
        // Read in input which is a 2D array
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        // Initalize the max value
        max = arr[0][0] + arr[0][1] + arr[0][2]
            + arr[1][1]
            + arr[2][0] + arr[2][1] + arr[2][2];
        
        for(i=0; i < 4; i++){
            for(j=1; j < 5; j++){
                curSum = 0;
                curSum += arr[i][j-1] + arr[i][j] + arr[i][j+1];
                curSum += arr[i+1][j];
                curSum += arr[i+2][j-1] + arr[i+2][j] + arr[i+2][j+1];
                
                if(curSum > max)
                    max = curSum;
            }
        }
        
        System.out.println(max);
    }
}