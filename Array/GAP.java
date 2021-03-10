/*

merge two sorted arrays with o(1) aux space , use the gap method to run it in o(nlog(n)+O(n)) for the final sort 


totally three methods to solve this 
1. normally take each elem and compare with all the elem of the arrays and put in the final array 
2.compare elem of one array to the other find if it is greater or not and solve the final array
3.gap algo -> take the init gap as n%2 and traverse until the final and repeat the process until the final step


*/

class GAP{

    static void gapfunc(int arr1[],int arr2[]){
        int t_len = arr1.length+arr2.length;
        int g_ind = t_len%2;
        for(int c=0;c<t_len;c++){
            if(g_ind>t_len){
                g_ind = g_ind%2;
            }
            
        }
    }

}