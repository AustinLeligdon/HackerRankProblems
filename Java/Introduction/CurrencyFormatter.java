import java.util.*;
import java.text.*;

// Input an int and output that int formatted in various currencies

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String us, india, china, france;
        
        /*
        India's Locale must be constructed because it is not built-in
        From the IANA Language Subtag Registry -
            Type: region
            Subtag: IN
            Description: India
            Added: 2005-10-16
        The language is 'en' as specified by Hackerrank
        */
        final Locale INDIA = new Locale("en", "IN");
        
        // Format the payment int as a number format for a spefied Locale and store as a string
        us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        // Print out various formats
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
