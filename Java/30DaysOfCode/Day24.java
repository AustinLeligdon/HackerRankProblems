import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Day24{
    /**
    *   Takes a linkedlist and removes the duplicate integers
    *
    * @param head the beginning of the list
    * @return the beginning of the list
    **/
    public static Node removeDuplicates(Node head) {
        Node nextN = head, last = head;
        while(nextN != null){
            // If the last node and the next have the same number, delete next
            if(last.data == nextN.data){
                // Point next value to skip duplicate
                last.next = nextN.next;
            }
            // Go to next value
            last = nextN;
            nextN = nextN.next;
        }
        
        return head;
    }

    // Given from HackerRank
	public static  Node insert(Node head,int data){
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head){
        Node start=head;
        while(start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}