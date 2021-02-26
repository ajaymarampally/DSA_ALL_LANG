/*
    find the min jumps require to reach the end of the array 
    1. find if the given index is the end of the array 
    2.dec var maxR , step_pos , jumps -> init to maxR -> arr[0] , step_pos = arr[0] , jump = 1
    3.while iteration  maxR = max(maxR,i+arr[i]) , steps-- 
    4. if step = 0 , j++ , if(i>maxR)-> return -1 , else step = maxR - i

*/
class minjump {
    
    static int minjfunc(int arr[]){
        int max_r = arr[0];
        int jump = 1;
        int step_pos = arr[0];
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                return jump;
            }
            else if(step_pos==0){
                jump++;
                if(i>max_r){return -1;}
                step_pos = max_r-i;
                
            }
            max_r = Math.max(max_r,i+arr[i]);
            step_pos--;
        }
        return jump;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,9,6,2,6,7,6,8,9};
        int ans = minjfunc(arr);
        System.out.println(ans);
    }

}
