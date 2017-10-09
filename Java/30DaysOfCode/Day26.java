import java.io.*;
import java.util.*;

public class Day26 {
    public static void main(String[] args) {
        // Initalize values
        Scanner scan = new Scanner(System.in);
        int dA, mA, yA, dE, mE, yE, fine;
        
        // Get input
        dA = scan.nextInt();
        mA = scan.nextInt();
        yA = scan.nextInt();
        dE = scan.nextInt();
        mE = scan.nextInt();
        yE = scan.nextInt();
        
        // If it is over a year there's a flat fine of 10,000
        if(yA-yE > 0)
            fine = 10000;
        // No fine for books returned year(s) early
        else if(yA-yE < 0)
            fine = 0;
        else{
            // Rate for every month late
            if(mA-mE > 0)
                fine = 500 * (mA-mE);
            // No charge if the book is returned month(s) early
            else if(mA-mE < 0)
                fine = 0;
            else{
                // Rate for every day late
                if(dA-dE > 0)
                    fine = 15 * (dA-dE);
                // No charge if the book is returned day(s) early
                else
                    fine = 0;
            }
        }
        
        // Print out the fine
        System.out.println(fine);
    }
}