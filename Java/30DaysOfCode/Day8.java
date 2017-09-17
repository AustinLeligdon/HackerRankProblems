import java.util.*;
import java.io.*;

// Create a dictionary of name/phoneNumber values
class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        // Number of vlaue pairs to read in
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        // Ready in and store names/numbers
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phoneBook.put(name, phone);
        }
        
        // Check a number of names for their stored values
        while(in.hasNext()){
            String s = in.next();
            
            //If it is in the phoneBook -> print out their number
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
