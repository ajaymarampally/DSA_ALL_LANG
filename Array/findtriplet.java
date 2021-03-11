import java.util.*;

/*
given a value , find the three elem in the arr which sum up to the given value 

algo:
1.naive -> take three nested loops and run whole through the arr , if they add up to sum return elem 
            time = o(n^3)
            space = o(1) -> the same arr is used for the traversal 
2.sort -> 1.sort the arr using quick sort o(nlogn)
          2.pick the first elem run the loop until the last two elem of the arr o(n)
          3.take two pointer algo , one from after the first elem and other from the last ->o(n) for the traversal
          4.if the sum is less inc the first pointer , else dec the second pointer 
          5.return three elem when the final place reaches 



*/
class findtriplet {
    
    static int[] findtriplet_func(int arr[],int sum){

        Arrays.sort(arr);
        int ans[] = new int[3];

        for(int c=0;c<arr.length-2;c++){

            int l=c+1;
            int r=arr.length-1;
                while(l<r){
                    if(arr[c]+arr[l]+arr[r]==sum){
                        ans[0] = arr[c];
                        ans[1] = arr[l];
                        ans[2] = arr[r];
                    }
                    else if(arr[c]+arr[l]+arr[r]<sum){
                        l++;
                    }
                    else if(arr[c]+arr[l]+arr[r]>sum)
                        r--;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int arr[] = {12,3,4,1,6,9};
            int sol[] = new int[3];
            int sum = 24;
            sol = findtriplet_func(arr, sum);
            System.out.println(sol);
            methods.printarr(sol);
        }
    }

