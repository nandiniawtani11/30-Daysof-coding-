import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if(N%2!=0)
            System.out.print("Weird");
        else if(2<=N && N<=5)
        System.out.print("Not Weird");
        else if(6<=N && N<=20)
        System.out.print("Weird");
        else
        System.out.print("Not Weird");
        
    }
}
