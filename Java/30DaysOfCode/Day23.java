import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Day23{
    /**
    *   Print out the tree's data in a level order sort
    *
    * @param root The root node of the tree
    */
    static void levelOrder(Node root){
        // Create a queue to keep track of the tree's order
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while(queue.peek() !=null){
            // Prit out the next node in the tree
            Node next = queue.remove();
            System.out.print(next.data +" ");
            
            // Add the left then right nodes to the queue if possible
            if(next.left != null)
                queue.add(next.left);
            if(next.right != null)
                queue.add(next.right);
        }
    }

    // Given from HackerRank
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}