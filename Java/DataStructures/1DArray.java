import java.util.*;

//Read in numbers to an array and print out the array

public class 1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] numbers = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            numbers[i] = val;
        }
        scan.close();

        // Prints each sequential element in array numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}