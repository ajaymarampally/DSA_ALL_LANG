import java.util.Arrays;

/*
i/p - given int arr consisting n integers determing the values of the choclates at each and every pos 
res - everyone should get aleast one choc 
find the min choc required to distribute to the students 

the chocs must be distributed between m students

brute - > find subsets of m in the inp arr 
sortalgo:
     1.sort the arr , compare the ind of the start and the i+m -1 
     2.return the index where it has min vales 
*/
/**
 * Innerchoc
 */
import java.util.*;
 
class choc{
     
    // arr[0..n-1] represents sizes of
    // packets. m is number of students.
    // Returns minimum difference between
    // maximum and minimum values of
    // distribution.
    static int findMinDiff(int arr[], int n,
                                    int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;
      
        // Sort the given packets
        Arrays.sort(arr);
      
        // Number of students cannot be
        // more than number of packets
        if (n < m)
           return -1;
      
        // Largest number of chocolates
        int min_diff = Integer.MAX_VALUE;
      
        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
         
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = {12, 4, 7, 9, 2, 23,
                    25, 41, 30, 40, 28,
                    42, 30, 44, 48, 43,
                   50};
                    
        int m = 7;  // Number of students
         
        int n = arr.length;
        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
             
    }
}