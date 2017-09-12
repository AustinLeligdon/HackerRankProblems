import java.io.*;
import java.util.*;

/*
In this challenge, we're going to learn about the difference between a class and an instance; 
because this is an Object Oriented concept, it's only enabled in certain languages. 

Input is handled for you by the stub code in the editor.
The first line contains an integer, T (the number of test cases), and the T subsequent lines each
contain an integer denoting the age of a Person instance.
*/

public class Day4 {
    private int age;	
  
	public Person(int initialAge) {
  		// Run some checks on initialAge
        if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            this.age = initialAge;
        }
	}

	public void amIOld() {
  		// Determining if this person's age is old and print the correct statement:
        String toPrint = "";
        
        if(this.age < 13)
            toPrint = "You are young.";
        else if(this.age >= 13 && this.age < 18)
            toPrint = "You are a teenager.";
        else    // if(this.age >= 18)
            toPrint = "You are old.";
        
        System.out.println(toPrint);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}

    //Given code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}