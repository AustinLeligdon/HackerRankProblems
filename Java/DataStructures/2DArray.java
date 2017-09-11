import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Input is a 6*6 array and the houtput should be the max hourglass sum in the array

public class 2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        //Initalize variables
        int sumCurrent=0, sumMax=0;
        boolean firstCase = true;
        for(int i=0; i <= 3; i++){
            for(int j=0; j <= 3; j++){
                //Sum the current hourglass using offsets
                sumCurrent += arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sumCurrent += arr[i+1][j+1];
                sumCurrent += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                //If the current is greater than the max hourglass, set new value
                if(sumCurrent > sumMax || firstCase == true)
                    sumMax = sumCurrent;
                sumCurrent =0;
                firstCase = false;
            }
        }
        
        //Print out the max hourglass in the array
        System.out.println(sumMax);
    }
}