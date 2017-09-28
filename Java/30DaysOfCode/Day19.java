import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    /**
    *   Abstract class divisorSum
    *
    *   @param n
    **/
    int divisorSum(int n);
}


class Calculator implements AdvancedArithmetic{
    /**
    *   Calculate the sum of n's divisors
    *
    *   @param n Number whose divisors should be summed
    **/
    public int divisorSum(int n){
        // Initalize
        int i=0, sum=0;
        // If n can be divided by i, add it to the sum variable
        while(i++ <= n){
            if(n%i == 0)
                sum += i;
        }
        
        return sum;
    }
}

// Given from HackerRank
class Day19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}