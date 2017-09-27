import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;

    /**
    *   Creates a new node pointing to nothing
    *
    *   @param d The data to insert to the node
    **/
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day15 {
    /**
    *   Inserts a node to the end of the linked list
    *
    *   @param head The head of the linkedlist
    *   @param data The data to be added at the end of the linkedlist
    **/
    public static  Node insert(Node head, int data) {
        // Initalize variables
        Node nextN = new Node(data);
        Node tmp = head;
        
        // Determine if this is the first node in the list
        if(head == null){
            head = nextN;
        }else{
            // Find the last node in the list
            while(tmp.next != null){
                tmp = tmp.next;
            }
            
            // Add the new node to the end of the list
            tmp.next = nextN;
        }
        
        return head;
    }

    // Given from HackerRank
    /**
    *   Displays the data in the linked list, starting at the head
    *
    *   @param head The head of the linkedlist
    **/
	public static void display(Node head) {
        Node start = head;

        // Print out data line by line
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        // Read in number of nodes and their data
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        // Insert into a linkedlist
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }

        // Display the list
        display(head);
        sc.close();
    }
}