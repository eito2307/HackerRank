/*Given a time 12-hour Am/PM format, convert it to military (24-hour) time.
Note: -12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock-
12:00:00PM on a 12.hour clock is 12:00:00 on a 24-hour clock
Example
s='12:01:00PM'
Return '12:01:00'.
Return '00:01:00'.
Function Description
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format
timeConversion has the following parameter(s):
string s: a time in 12 hour format
Returns
string: the time in 24 hour format
Input format
A single string s that represents a time in 12hour clock (i.e.:hh:mm:ssAm or hh:mm:ssPM).
Contraints
All input times are valid
Sample Input 0 
07:05:45PM
Sample Output 0
19:05:45
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
     if(s.charAt(8)=='P'){

        String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(times[0].matches("12")){
            return times[0] + ":" + times[1] + ":" + times[2];
        }
        times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
        return times[0] + ":" + times[1] + ":" + times[2];
     }else{
         String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(times[0].matches("12")){
            times[0]= "00";
            return times[0] + ":" + times[1] + ":" + times[2];
        }
         return s.substring(0,8);
     }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
