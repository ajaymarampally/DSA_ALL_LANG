/*
find the occurence of the elem in the given arr as lenofarr/givennumber
i/p->  [3,1,2,2,2,1,4,3,4] , k = 4
o/p -> [3,2,4] - > occuring more than twice in the arr

algo:
    1.naive -> traverse the arr in two loops find the count and increse the counter o(n^2)
    2.sort: 1.sort the algo o(nlogn)
            2.linear traverse to find the count of the numbers
    3.struct - 1.create a struct with elem , count
                2. add elem of the arr to the struct , if already exists increase the count 
                3.return the elem with the sufficent count

*/


class nk {

    static class nk1{
        int elem;
        int cnt;
    }
    static int nk_func(int arr[],int k){

        // if the size k is less than 2 cannot find the elem
        if(k<2)
            return 0;
        nk1 []cntarr = new nk1[k-1];
        for(int c=0;c<k-1;++c){
            cntarr[c] = new nk1();
        }
        for(int c=0;c<k-1;++c){
            cntarr[c].cnt = 0;
            // init the count as 0
        }
        for(int c:arr){
            int x;
            // if the elem is in the cntarr increase the count
            for(x=0;x<k-1;x++){
                if(cntarr[x].elem==c){
                    cntarr[x].cnt++;
                }
        }
        
        if (x == k - 1) {
            int l;         
            /* If there is position available 
              in temp[], then place arr[i] in 
              the first available position and 
              set count as 1*/
            for (l = 0; l < k - 1; l++)
            {
                if (cntarr[l].cnt == 0) 
                {
                    cntarr[l].elem = c;
                    cntarr[l].cnt = 1;
                    break;
                }
            }
            // if all the pos are filled and new elem has to be added decr the cnt by 1 for all the elm   
            if (l == k - 1)
                for (l = 0; l < k-1; l++)
                    cntarr[l].cnt -= 1;     
            }
            for (int i = 0; i < k - 1; i++)
    {
       
        // Calculate actual count of elements
        int ac = 0; // actual count
        for (int j = 0; j < arr.length; j++)
            if (arr[j] == cntarr[i].elem)
                ac++;
 
        // If actual count is more than n/k,
       // then print it
        if (ac > arr.length / k)
            System.out.print("Number:" +  cntarr[i].elem
                + " Count:" +  ac +"\n");
    }
        }
        return 2;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 4, 4 };
        methods.printarr(arr);
        int k = 3;
        nk_func(arr, k);
        
    }
}
