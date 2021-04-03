/*
i/p -> given total block available in the quesion , find the toatal possible rain water which can be harvested 

1.brute force => find all the possibilites of saving water at each and every single possible interval 
and sum to find the complete water stored

for every elemen in the arr ,find the left max and right maax which can store the water 
that is min(left(arr),right(arr))-(elem at the index)

    1.compute prefix sum array for both the left and right max sum ->o(n)+o(n)
    2.traverse the array from o to n-1 ->o(n)
    3.water stored is (min(prefixleft(atthatindex),prefixright(atthatindex)))-water stored that specific index
or can use the two pointer algorithm:
    1.use two left and right indexes , o and n-1
    2.compare the value of the prefixl and prefixright for every iteration 
    3.if the left is > right:
        1.computer the diff between the preleftmax and the current index to find the water stored at the 
        given location 
        2.add the res to the total 
    4.if the right is great:
        1.update the value of the right index and right -- 
        2.compute the value of the water stored and add it to the res 
*/
class rainwater{
    static void prefixsumleft(int arr[]){
        int max =0;
        for(int c=0;c<arr.length;c++){
            if(arr[c]>max){
                max = arr[c];   
            }
            else if(arr[c]<max){
                arr[c] = max;
            }
        }
    }
    
    static void prefixsumright(int arr[]){
        int max = 0;
        for(int c=arr.length-1;c>0;c--){
            if(arr[c]>max){
                max = arr[c];   
            }
            else if(arr[c]<max){
                arr[c] = max;
            }
        }
    }
    static int[] calcfuncwater(int arr[],int n,int[] preleft,int[] preright){
        int[] sol =  new int[n];
        for(int c=0;c<arr.length;c++){
            int res = Math.min(preleft[c],preright[c]) - arr[c];
            sol[c] = res;
        }

        return sol;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int preleft[] = new int[arr.length];
        int preright[] = new int[arr.length];
        prefixsumleft(preleft);
        prefixsumright(preright);
        int sol[] = new int[arr.length];
        sol = calcfuncwater(arr, arr.length, preleft, preright);
        int ans = methods.sumarr(sol);
        methods.printarr(preleft);
        methods.printarr(preright);
        methods.printarr(sol);
        System.out.println(ans);
    }
}

