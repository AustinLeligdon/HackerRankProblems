import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int answer=0;
        
        //while there is still money left
        while(s > 0){
            //subtract the price of a game from our total amount
            s-=p;
            //if we have enough to buy it then add one to the answer
            if(s>=0){
                answer++;
            }
            
            //decrease the price by d if it is higher than m
            if(p>m)
                p-=d;
            //do not let the price go below m
            if(p<m)
                p=m;
        }
        
        return answer;
    }

    //Given from HackerRank
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}