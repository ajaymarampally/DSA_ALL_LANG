import java.util.HashSet;

/* 

find the max consec sequence in the arr 

prob : [1,4,3,2,101,100,102]
ans -> 4 (1,2,3,4)

algo: naive -> 1.sort the arr (nlogn)
               2.check if the next elem if consec (using a for loop for this check o(n))
      time: nlog(n)+o(n)
      space: o(n)
      
      hashset : 1.enter all the elem into the hash set
                2.for every elem:
                    1.check if elem-1 exists if exists cont
                    2.else-> check elem+1 exists in the set , increase the counter
                    3.return the counter (ans)

*/


class maxconsec {
    
    static int maxconsec_func(int arr[]){
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int num:arr){
            hash.add(num);
        }
        System.out.println(hash);
        int ans = 0;
        for(int num:hash){
            if(!hash.contains(num-1)){
                int current_num = num;
                int current_count = 1;
                while(hash.contains(num+1)){
                    current_num = num+1;
                    current_count++;
                }
                ans = Math.max(ans,current_count);
                System.out.println(ans);  
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,101,100,102};
        methods.printarr(arr);
        int sol = maxconsec_func(arr);
        System.out.println(sol);
    }

}
