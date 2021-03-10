/*
find the lex order next permutation of the given input 

1 4 3 2 5

1.traverse from the back and find the elem which does not follows descending order 
2.swap the elem with the next greatest elem from the back 
3. reverse all the elem after the item selected in step 2 to find the next lex_perm as they follow close pattern


*/
import java.util.*;

class nextperm {
    
    static void nextperm_func(int arr[]){
        // check for the null case 
        if(arr.length<=0)
            return;
        //take the break point for the opxn as 2nd last elem 
        int ind = arr.length -2;
        while(ind>=0 && arr[ind]>=arr[ind+1])
            ind--;
            //check for empty 
            if(ind>=0){
                int j= arr.length -1;
                while(arr[j]<=arr[ind])
                    j--;
                    methods.swap(arr, ind, j);
            }
            methods.reverse_arr(arr, ind+1, arr.length-1);
 
    }
    public static void main(String[] args) {
        int data[] = { 1,2,3 }; 
        nextperm_func(data);
        System.out.println(Arrays.toString(data)); 
         
    }


}
