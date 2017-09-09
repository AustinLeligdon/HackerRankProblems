import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        
        Hashtable bTypes = new Hashtable();
        int type;
        
        //System.out.print(n+" "+m+" "+q);
        int i;
        for(i=1; i<=n; i++){
            type = in.nextInt();
            bTypes.put(i, type);
        }
        /*
        for(i=1; i<=n; i++){
            System.out.print(i+" :");
            type = (int)bTypes.get(i);
            System.out.println(type);
        }
        */
        int from, to, pathVal;
        
        Hashtable paths = new Hashtable();
        for(i=1; i<n; i++){
            from = in.nextInt();
            to = in.nextInt();
            pathVal = in.nextInt();
            
            if(paths.containsKey(from)){
                ArrayList pathAdd = new ArrayList();
                pathAdd = (ArrayList<Integer>)paths.get(from);
                pathAdd.add(to);
                pathAdd.add(pathVal);
                
                System.out.println(from+ " : " + pathAdd);
                paths.put(from, pathAdd);
            }else{
                ArrayList path = new ArrayList();
                path.add(to);
                path.add(pathVal);
                
                paths.put(from, path);
            }
            /*System.out.println(from + "+");
            System.out.println(path[0]);
            System.out.println(path[1]);*/
        }
        
        for(i=1; i<=n; i++){
            if(paths.containsKey(i)){
                ArrayList searchArr = new ArrayList();
                searchArr = (ArrayList<Integer>)paths.get(i);

                System.out.println(i);
                System.out.println(searchArr);
                System.out.println("----");
            }else{
                System.out.println(i + "*");
            }
        }

        //Have all input in variables besides last line. Now we need to find the shortest path
        from = in.nextInt();
        to = in.nextInt();
        numBuildings = in.nextInt();
        //Need to start at from, end on two, and go to the number of buildings specified
        //array of building types, only add new values, go until size is 4
        int size = 0;
        ArrayList buildingTypes = new ArrayList();
        
        
    }
}