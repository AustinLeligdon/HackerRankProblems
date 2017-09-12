import java.util.Scanner;

/* After finishing my final problem in the introduction section-
Congrats Austin! You just solved all the Introduction challenges in Java!
*/

public class OutputFormatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                String s;
                if(x<10)
                    s = "00" + x;
                else if(x<100)
                    s = "0" + x;
                else
                    s = "" + x;
                
                // Pad the string on the right 15 characters
                s1 = String.format("%1$-15"+ "s", s1);
                System.out.println(s1 + s);
            }
            System.out.println("================================");

    }
}