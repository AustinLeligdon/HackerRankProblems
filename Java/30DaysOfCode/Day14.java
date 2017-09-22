import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    // Initalize variables
  	private int[] elements;
  	public int maximumDifference;
    private int length;

    /**
    *   Class constructor
    *   
    *   @param elements Array of elements
    **/
    Difference(int[] elements){
        this.elements = elements;
        this.length = elements.length;
    }

    /**
    *   Finds the maximum difference 
    * 
    * 
    **/
    public void computeDifference(){
        // Sort elements. Min to max
        quickSort(0, length-1);
        
        // When they are in order -> calculate the absolute value of the min element - the max element
        maximumDifference = Math.abs(elements[0]-elements[length-1]);
    }

    /**
    *   QuickSort implementation
    *
    *   @param lowStart The lower element of the array to start sorting from
    *   @param highStart The higher element of the array to end sorting at
    **/
    private void quickSort(int lowStart, int highStart){
        // Initalize
        int low = lowStart;
        int high = highStart;
        
        // Find the pivot point (middle value)
        int pivot = elements[low + (high-low)/2];
        
        // Sort towards the pivot point
        while(low <= high){
            /**
                Find a number lower than the pivot
                Find a number higher than the pivot
                Exchange the numbers in the array
            */
            while(elements[low] < pivot){
                low++;
            }
            while(elements[high] > pivot){
                high--;
            }
            if(low <= high){
                exchange(low, high);
                low++;
                high--;
            }
            
            // Call quickSort() method recursively
            if (lowStart < high)
                quickSort(lowStart, high);
            if (low < highStart)
                quickSort(low, highStart);
        }
    }

    /**
    *   Switches the numbers in the array
    *
    *   @param i Lower number to swap
    *   @param j Higher number to swap
    **/
    private void exchange(int i, int j){
        int tmp = elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
    }
}

// Given from HackerRank
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}