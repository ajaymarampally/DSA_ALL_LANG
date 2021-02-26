/* given n nodes and the values of their heights , value k which can be added or subtracted , find the max
    difference between the largest and the smallest node among the values 
    1. sort the array 
    2. find add , sub for the array elem with the given elem 
    3. take the min of the both
    4.return max-min of the new array

*/
class maxheight {
    static int maxh(int arr[],int k){
        int add , sub ;

        for(int i=0;i<arr.length;i++){
            add = arr[i]+k;
            sub = arr[i]-k;
            arr[i]= methods.minmum(add, sub);
        }

        int min = methods.minarr(arr);
        int max = methods.maxarr(arr);
        return max-min;
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        methods.fillarr(arr);
        methods.sortarr(arr);
        methods.printarr(arr);
        int ans = maxh(arr,10);
        System.out.println(ans);

    }

}
