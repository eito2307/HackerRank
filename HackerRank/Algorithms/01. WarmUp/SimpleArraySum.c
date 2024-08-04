/*Given an array of integers, find the sum of its elements. 
For example, if the array ar=[1,2,3.]1+2+3=6, so return 6
Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
SimpleArraySum has the following parameter(s):
ar: an array of itegers
Input Format
The first line contains an integer, n, denoting the size of the Array.
The second line contains n space- separated integers represeting the array's elements.
Contraints
a<n,ar[i]=<1000
Output Format
Print the sum of the array's elements as a single integer.
Sample Input 
6
1 2 3 4 10 11
Sample Output
31
Explanataion
We print the sum of the array's elements 1+2+3+4+10+11=31.
*/
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int first(int arreglo[], int j)
{
    int i, sum=0;
    arreglo[j];
    for(i=0;i<j;i++)
    { 
     sum=sum+arreglo[i];   
    }
    return sum;
}
int main()
{
    int n,lol; 
    scanf("%d",&n);
    int arr[n];
    for(int i = 0; i < n; i++)
    {
       scanf("%d",&arr[i]);
    }
      printf("%d",first(arr,n));
    return 0;
}
