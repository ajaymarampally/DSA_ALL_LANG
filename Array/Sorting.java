import java.util.*;


class Sorting {
    
    public static int[] fill(int arr[]){
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]= i;
            i++;
        }
        return arr;
    }
    public static int min(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        int main[] = new int[20];
        fill(main);
       int mm= min(main,12);
       System.out.println(mm);
       printarr(main);
    }


}
