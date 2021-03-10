/*

find the total max product sub array 
consider three elems -> max_end , min_end , cur elem 
max end of the calc will be max(cur, cur*max_end , cur*min_end) 
min end will be min(cur , cur*min_end , cur*max_end) 
for the calc of the min_end update the value of the max_end by init the max_end at the begining of the loop 

time : o(n) -> one loop for all the checks 
space : o(1) -> only one array is init for the whole process

*/

class maxprod {

    static int maxprod_func(int arr[]){
        int max_overall = arr[0];
        int max_end = arr[0];
        int min_end = arr[0];

        for(int c=1;c<arr.length-1;++c){
            int tmp = max_end;
            int cur = arr[c];
            max_end = Math.max(cur,Math.max(cur*max_end,cur*min_end));
            min_end = Math.min(cur,Math.min(cur*max_end,cur*min_end));
            max_overall = Math.max(max_end,max_overall);
            int temp_arr[] = {cur,max_overall,max_end,min_end};
            methods.printarr(temp_arr);
        }
        return max_overall;
    }

    public static void main(String[] args) {
        int arr[] = {-3,2,-4,6,0,-8,5};
        methods.printarr(arr);
        int res = maxprod_func(arr);
        System.out.println(res);
    }

    
    
}
