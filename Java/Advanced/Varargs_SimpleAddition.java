import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Input will be 6 lines of numbers
class Add{
    //Add 2
    public void add(int a, int b){
        int sum = a+b;
        System.out.println(a +"+"+ b +"="+ sum);
    }
    //Add 3
    public void add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(a +"+"+ b +"+"+ c +"="+ sum);
    }
    //Add 4
    public void add(int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println(a +"+"+ b +"+"+ c +"+"+ d +"="+ sum);
    }
    //Add 5
    public void add(int a, int b, int c, int d, int e){
        int sum = a+b+c+d+e;
        System.out.println(a +"+"+ b +"+"+ c +"+"+ d +"+"+ e +"="+ sum);
    }
    //Add 6
    public void add(int a, int b, int c, int d, int e, int f){
        int sum = a+b+c+d+e+f;
        System.out.println(a +"+"+ b +"+"+ c +"+"+ d +"+"+ e +"+"+ f +"="+ sum);
    }
}

//Base code from HackerRank
public class Varargs_SimpleAddition {
    public static void main(String[] args) {
        try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);

			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
            
			for(int i=0;i<methods.length;i++){
				if(set.contains(methods[i].getName())){
					overload=true;
					break;
				}
				set.add(methods[i].getName());
			}
			if(overload){
				throw new Exception("Overloading not allowed");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}