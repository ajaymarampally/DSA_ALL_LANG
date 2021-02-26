public class neg2 {

    static void fillarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int rand = (int)(Math.random()*500*(Math.random()>0.5?1:-1));
            arr[i] = rand ;
        }
    }
    static void swap(int arr[],int i,int j){
        int temp = 0 ;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp ;
    }
    static void repl(int arr[]){
        int l = 0;
        int r = arr.length - 1 ;
        if(arr[l]<0 && arr[r]<0){
            l++;
        }
        else if(arr[l]>0 && arr[r]<0){
            swap(arr,l,r);
            l++;
            r--;
        }
        else if(arr[l]<0 && arr[r]>0){
            l++;
            r--;
        }
        else if(arr[l]>0 && arr[r]>0){
            r--;
        }
    }
    static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        fillarr(arr);
        printarr(arr);
        repl(arr);
        printarr(arr);
        
    }    
}
