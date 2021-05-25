// find an elem in a sorted arr 
// three conditions,select top -right elem as the start pos
// 1.if elem > start -> no need to check for the present row 
// skip to the next row 
// 2.if elem <start -> no need to check the present col check the previous col 
// 3.equal found the elem

#include <bits/stdc++.h>
using namespace std;


/* Searches the element x in mat[][]. If the
element is found, then prints its position
and returns true, otherwise prints "not found"
and returns false */
int search(int mat[4][4], int n, int x)
{
    if (n == 0)
        return -1;
   
    int smallest = mat[0][0], largest = mat[n - 1][n - 1];
    if (x < smallest || x > largest)
        return -1;
   
    // set indexes for top right element
    int i = 0, j = n - 1;
    while (i < n && j >= 0)
    {
        if (mat[i][j] == x)
        {
            cout << "n Found at "
                 << i << ", " << j;
            return 1;
        }
        if (mat[i][j] > x)
            j--;
       
        // Check if mat[i][j] < x
        else
            i++;
    }
 
    cout << "n Element not found";
    return 0;
}
 
// Driver code
int main()
{
    int mat[4][4] = { { 10, 20, 30, 40 },
                      { 15, 25, 35, 45 },
                      { 27, 29, 37, 48 },
                      { 32, 33, 39, 50 } };
    search(mat, 4, 29);
 
    return 0;
}
 