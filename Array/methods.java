import java.util.*;
public class methods {
    public static int  minmum(int a , int b){
        return ((a<b?a:b));
    }
    public static void fillarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        int rand = (int)(Math.random()*500*(Math.random()<0.5?1:-1));
        arr[i] = rand;
        }
    }
    static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
    }
    static void sortarr(int arr[]){
        Arrays.sort(arr);
    }
    static int minarr(int arr[]){
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int min = stat.getMin();
        return min;
    }
    
    static int maxarr(int arr[]){
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int max = stat.getMax();
        return max;
    }
     static int[] swap(int data[], int left, int right) 
    { 
  
        // Swap the data 
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
        // Return the updated array 
        return data; 
    } 

    static void reverse_arr(int arr[],int i,int j){
        while(i<j)
            swap(arr,i++,j--);
    }
    static int sumarr(int arr[]){
        int sum = 0;
        for(int c:arr){
            sum+= c;
        }
        return sum;
    }
}
        