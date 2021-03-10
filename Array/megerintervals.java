/*

input -> set of arrays with unsorted intervals 
op -> merge the intervals to form sorted intervals 

1.sort the given i/p based on the start time in increasing order fashion
2.push first elem to the stack 
3.for each elem: 
 if interval does not overlap , push it to the top of the stack 
 else if overlaps , update the end time as the end time of the greatest elem 

4. final stack contains the merged elems


*/

import java.util.*;
public class megerintervals {

    public static void mergefunc(Interval arr[]){
        if(arr.length<=0)
            return;
        
        Stack<Interval> stack1 = new Stack<>();
        Arrays.sort(arr,new Comparator<Interval>(){ 
            public int compare(Interval i1,Interval i2) 
            { 
                return i1.start-i2.start; 
            } 
        });

        //push first arr elem to the stack 

        stack1.push(arr[0]);

        for(int c=0;c<arr.length;c++){
            Interval top = stack1.peek();
            if(top.end<arr[c].start)
                stack1.push(arr[c]);
            else if(top.end<arr[c].end)
                top.end = arr[c].end;
                stack1.pop();
                stack1.push(top);

        }
    }
    public static void main(String args[]) { 
        Interval arr[]=new Interval[4]; 
        arr[0]=new Interval(6,8); 
        arr[1]=new Interval(1,9); 
        arr[2]=new Interval(2,4); 
        arr[3]=new Interval(4,7); 
        mergefunc(arr); 
    }
    
    class Interval 
{ 
    int start,end; 
    Interval(int start, int end) 
    { 
        this.start=start; 
        this.end=end; 
    } 
} 


}
