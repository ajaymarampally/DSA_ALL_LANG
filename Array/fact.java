/*

1.to find the fact of the number multiply it by itself 
2. to multoply - > 1. take the numbers in the reverse order in an array 
2. for i = 0 -=> len -1 : mul = res* [x]+c 
prod = ans[0] , car = ans [1]




*/
import java.util.*;

class fact {

    static void fact(int n){
        int max = Integer.MAX_VALUE;
        int res[] = new int[1000];
        res[0] = 1;
        int res_size = 1;
        for(int c = 2;c<n;c++){
           res_size = multiply(c,res,res_size);    
        }
           System.out.println("Factorial of given number is ");
           for (int i = res_size - 1; i >= 0; i--)
               System.out.print(res[i]); 
    }
    static int multiply(int x , int res[], int res_size){
        int rem = 0;
        for(int i=0;i<res_size;i++){
            int prod = res[i]*x+rem;
            res[i] = prod%10;
            rem = prod/10;
        }
            while (rem!=0)
            {
                res[res_size] = rem % 10;
                rem = rem / 10;
                res_size++;
            }
            return res_size;
        
    }

    public static void main(String[] args) {
        fact(200);
    }


}

