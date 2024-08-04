
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
