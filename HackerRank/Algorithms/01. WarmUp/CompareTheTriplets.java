/* 
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 * The rating for Alice's challenge is the triplet a=(a[0],a[1],a[2]) and the rating for Bob's challenge is the triplet b=(b[0],b[1],b[2]).
 * The task is to find their comparison points by comparison points by comparing a[0] with b[0], a[1], and a[2] with b[2].
 * If a[i]>b[i], then Alice is awarded 1 point.
 * If a[i]<b[i], then Bob is awarded 1 point.
 * If a[i]=b[i]then neither person receives a point
 * Comparison points is the total points a person earned.
 * Given a and b, determine their respective comparison points.
 * Example
 * a = [1,2,3]
 * b=  [3,2,1]
 * For elements *0*, Bob is awarded a point because a[0].
 * For the equal elements a[1] and b[1], no points are earned.
 * Finally, for elements 2, a[2]>b[2] so Alice receives a point.
 * The return array is [1,1] with Alice's score first and Bob's second
 * Function Description
 * Complete the function compareTriplets in the editor below.
 * compareTriplets has the folowing parameter(s):
 * int a[3]: Alice's challenge rating
 * int b[3]: Bob's challenge rating
 * Return
 * int[2]: Alice's score is in the first position, and Bob's score is in the second.
 * Input Format
 * The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
 * Second line contains 3 space-separated integers, b[0],b[1], and b[2] the respective values in triplet b.
 * Constraints
 * 1=<a[i]=<100
 * 1=<b[i]=<100
 * Sample Input 0
 * 5 6 7
 * 3 6 10
 * Sample Outout 0
 * 11
 * Explanation 0 
 * In this example
 * a=(a[0],a[1],a[2])= (5,6,7)
 * b=(b[0],b[1],b[2])= (3,6,10)
 * Now, let's compare each individual score:
 * a[0]>b[0] so Alice receives 1 point
 * a[1]=b[1], so nobody receives a point
 * a[2]<b[2], so Bob receives 1 point.
 * Alice's comparison score is 1, and Bob's comparison score is 1. This, we return the array [1,1]
 * Sample Input 1
 * 17 28 30
 * 99 16 8
 * Sample Output 1
 * 2 1
 * Explanation the 0^th elements 17 <99 so Bob receives a point
 * Comparing the 1st and 2nd elements 28 >16 and 30>8 so Alice receives two points 
 * the return array is [2,1].
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    static String solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int alice=0;
        int bob=0;
                if(a0>=1 && a0<=100 && a1>=1 && a1<=100 && a2>=1 && a2<=100 && b0>=1 && b0<=100 && b1>=1 && b1<=100 && b2>=1 && b2<=100)
{
         if(a0>b0)
            alice+=1;
        else if(a0<b0)
            bob+=1;
        if(a1>b1)
            alice+=1;
        else if(a1<b1)
            bob+=1;
        if(a2>b2)
            alice+=1;
        else if(a2<b2)
            bob+=1;
            return (alice+" "+bob);
            }
          else
              {
                  System.exit(1);
                  return "0";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt(); 
        int a2 = in.nextInt();
        int b0 = in.nextInt(); 
        int b1 = in.nextInt(); 
        int b2 = in.nextInt(); 
        String result = solve(a0, a1, a2, b0, b1, b2);
        System.out.println(result);
    }
}
