/*
given a value , find the three elem in the arr which sum up to the given value 

algo:
1.naive -> take three nested loops and run whole through the arr , if they add up to sum return elem 
            time = o(n^3)
            space = o(1) -> the same arr is used for the traversal 
2.sort -> 1.sort the arr using quick sort o(nlogn)
          2.pick the first elem run the loop until the last two elem of the arr o(n)
          3.take two pointer algo , one from after the first elem and other from the last ->o(n) for the traversal
          4.if the sum is less inc the first pointer , else dec the second pointer 
          5.return three elem when the final place reaches 



*/
class findtriplet {
    
}
