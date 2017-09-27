import java.io.*;
import java.util.*;

public class Day18 {
    Stack st = new Stack();
    Queue<Character> queue = new LinkedList<Character>();
    
    /**
    *   Push a character onto a stack
    *
    *   @param ch Character to be added to the stack
    **/
    void pushCharacter(char ch){
        st.push(ch);
    }
    
    /**
    *   Add a character to a queue
    *
    *   @param ch Character to be added to the queue
    **/
    void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    /**
    *   Remove a character from the stack
    **/
    char popCharacter(){
        return (char)st.pop();
    }
    
    /**
    *   Remove a character from the queue
    **/
    char dequeueCharacter(){
        return queue.remove();
    }

    // Given from HackerRank
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " 
                           + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}