import java.io.*;
import java.util.*;

// Input is an array of ints. Print out the array in reverse order
public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i;
        
        for(i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for(i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
