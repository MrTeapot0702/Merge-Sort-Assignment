/*
 * This is the class to declare the actual class mergesort
 */

package merge.sort.assignment;

/**
 *
 * @author Paul Lee and Quentin Magoon
 */
class MergeSort {
    //This is for the void merge sort where we declare the basic variables
    void merge(int arr[], int f, int y, int r) 
    { 
        // Find the sizes for the two arrays to be merged
        int joker = y - f + 1; 
        int shulk = r - y; 
  
        
        int L[] = new int [joker]; 
        int R[] = new int [shulk]; 
  
        
        for (int i=0; i<joker; ++i) 
            L[i] = arr[f + i]; 
        for (int j=0; j<shulk; ++j) 
            R[j] = arr[y + 1+ j]; 
  
  
        // This is to declare the initial indexes of the array
        int i = 0, j = 0; 
  
        // This is the initial index of the arrays 
        int x = f; 
        while (i < joker && j < shulk) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[x] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[x] = R[j]; 
                j++; 
            } 
            x++; 
        } 
  
        
        while (i < joker) 
        { 
            arr[x] = L[i]; 
            i++; 
            x++; 
        } 
  
        
        while (j < shulk) 
        { 
            arr[x] = R[j]; 
            j++; 
            x++; 
        } 
    } 
  
    // This is the main area where it actually 
    void sort(int arr[], int red, int blue) 
    { 
        if (red < blue) 
        { 
            // This code is used to find the middle point
            int m = (red+blue)/2; 
  
            // This is to sort the first and second array 
            sort(arr, red, m); 
            sort(arr , m+1, blue); 
  
            //This is where it actually merges the array and the variables 
            merge(arr, red, m, blue); 
        } 
    } 
}
