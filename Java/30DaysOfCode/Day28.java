import java.io.*;
import java.util.*;

// 

public class Day28 {
    public static void main(String[] args) {
        //Initalize variables
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i;
        String name, email;
        ArrayList<String> names = new ArrayList<String>();
        
        //Read in the emails and add names to an arraylist
        for(i=0; i < num; i++){
            name = scan.next();
            email = scan.next();
            
            //Only keep the gmail addresses
            if (email.split("@")[1].equals("gmail.com")){
                names.add(name);
            }
        }
        
        //Make a new instance of Day28 to call sort method from main
        int size = names.size();
        Day28 d = new Day28();

        //Sort the names we kept
        d.sort(names, size);
        
        //Print out the sorted list
        for(i=0; i < size; i++){
            System.out.println(names.get(i));
        }
    }
    
    /**
    *   Sorts an array list of strings
    *
    * @param names the list to be sorted
    * @param size the size of the arraylist
    **/
    public void sort(ArrayList<String> names, int size){
        //Initalize
        String tmp;
        int i, j, totalSwaps;
        
        //Iterate through the array
        for(i=0; i < size-1; i++){
            totalSwaps = 0;
            
            //Swap elements next to eachother
            for(j=0; j < size-1; j++){

                // Swap elements if they are in decreasing order
                if(names.get(j).compareTo(names.get(j+1)) > 0){
                    tmp = names.get(j);
                    names.set(j, names.get(j+1));
                    names.set(j+1, tmp);

                    totalSwaps ++;
                }
            }
            
            //If we iterate throguh and nothing gets swaped then we are done sorting
            if(totalSwaps == 0){
                break;
            }
        }
    }
}