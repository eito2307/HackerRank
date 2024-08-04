import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        // your code goes here
        int min = score[0];
        int max = score[0];
        int minCount = 0;
        int maxCount = 0;
        for(int i=0; i<score.length; i++){
            if(min>score[i]){
                minCount++;
                min = score[i];
            }
            if(max<score[i]){
                maxCount++;
                max = score[i];
            }
        }
        System.out.println(maxCount + " " + minCount);
    }
}
