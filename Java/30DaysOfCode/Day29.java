import java.io.*;
import java.util.*;

public class Day29 {
    public static void main(String[] args) {
        //Initalize variables
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i, j, k, N, K, sum, max;
        
        //Loop through each set of numbers
        for(i=0; i<num; i++){
            N = scan.nextInt();
            K = scan.nextInt();
            max=0;
            
            //Get the bitwise AND of each pair in the set
            for(j=1; j < N; j++){
                for(k=j+1; k <= N; k++){
                    sum = k & j;
                    //Set max if it is less than the given K value
                    if(sum > max && sum < K)
                        max = sum;
                }
            }
            
            //Print out the max for each set
            System.out.println(max);
        }
    }
}