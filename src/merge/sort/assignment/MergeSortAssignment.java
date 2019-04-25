/*
 * This is the assignment for sorting ten thousand integer. Quentin and I have
 * decided to use the merge sort to srt the integers because merge sort is
 * extremely effective for sorting large amount of numbers.
 */

package merge.sort.assignment;

/**
 *
 * @author Paul Lee and Quentin Magoon
 */
public class MergeSortAssignment {

  static void printArray(int arr[]) 
    { 
        int array = arr.length; 
        for (int i=0; i<array; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
   
    // This is the final coding where the program actually runs this.
    public static void main(String args[]) { 
       
        int arr[] = {25, 41, 3, 5, 9, 10, 12, 75}; 
  
        System.out.println("The Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nThe Sorted array"); 
        printArray(arr); 
        
        System.out.println(System.nanoTime());
    }
    

}

