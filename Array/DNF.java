/**
 * DNF
 */
import java.util.*;
public class DNF {

    public static void c102(int a[]){
        int arr_s = a.length;
        int l = 0;
        int m=0;
        int h = arr_s-1;
        int temp = 0;
        int c1=0,c2=0,c3=0;
        while(m<=h){
                switch (a[m]) {
                    case 0:
                        temp = a[l];
                        a[l]=a[m];
                        a[m]=temp;
                        c1++;  
                        break;
                
                    case 1:
                        m++;
                        c2++;
                        break;
                    case 2:
                        temp = a[m];
                        a[m]=a[h];
                        a[h]=temp;
                        c3++;
                        break;
                }
            }
            
        }
        public static int[] fill012(int arr[]){
            int temp[] = {0,1,2};
            
            for(int i=0;i<arr.length-1;i++){
                int ins=temp[new Random().nextInt(arr.length)];
                arr[i] = ins;
            }
            return arr;
        }
        static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int arr[]= new int[20];
            fill012(arr);
            printarr(arr);
            c102(arr);
            printarr(arr);

        }
}
    
