import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static String binary(int n)
    {
        String s="";
        while(n>0)
        {
            int r=n%2;
            s=r+s;
            n=n/2;
        }
       // System.out.println(s);
        return s;
    } 
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String s=binary(n);
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            count=count+1;
            else
            {
                if(max<count)
                    max=count;
                count=0;
            } 
        }
        if(max<count)
        max=count;
        System.out.print(max);
        
    }
}
