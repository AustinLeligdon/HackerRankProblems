import java.io.*;
import java.util.*;

/* Custom input
  ni patcrphwumxtivb umj      bo dxd ob i bvw ko xc               
                               
         b d o w bt a cod nw j o p bn bd r a m k bbdwx p johhhh hfaj x fs f e gc pac sa jf f c rx umi fif t ij hn ekp x hl l h o mpt np hqplx nvkdi a nu xf wmq c sv pxklmxu
*/

// Finish
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // TODO 
        // Issue with multiple spaces
        
        String[] words = s.split("[ ,!?'@._]+");
        
        System.out.println(words.length);
        
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
        scan.close();
    }
}