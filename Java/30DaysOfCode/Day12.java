import java.util.*;

/**
*Sample Input*              *Sample Output*
Heraldo Memelli 8135627     Name: Memelli, Heraldo
2                           ID: 8135627
100 80                      Grade: O
*/

class Person {
    // Initalize variables
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	/*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    */
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student extends Person{
    // Initalize values
	private int[] testScores;
    private String fName, lName;
    private int id;
    
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[] scores){
        // Call person constructor
        super(firstName, lastName, id);
        this.fName = firstName;
        this.lName = lastName;
        this.id = id;
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        int sum = 0, average;
        char grade;
        
        // Calculate the average
        for(int i=0; i<testScores.length; i++){
            sum += testScores[i];
        }
        average = sum / testScores.length;
        
        // Give a letter grade specified by HackerRank
        if(average >= 90)
            grade = 'O';
        else if(average >= 80)
            grade = 'E';
        else if(average >= 70)
            grade = 'A';
        else if(average >= 55)
            grade = 'P';
        else if(average >= 40)
            grade = 'D';
        else    // <40
            grade = 'T';
        
        return grade;
    }
}

// Given class
class Day12 {
	public static void main(String[] args) {
        // Scan in input
		Scanner scan = new Scanner(System.in);
        
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];

		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
        // Create the student and print out grade
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}