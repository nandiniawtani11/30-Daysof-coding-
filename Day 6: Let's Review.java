import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String s1=sc.next();
            String even="";
            String odd="";
            for(int i=0;i<s1.length();i++)
            {
                if(i%2==0)
                even=even+s1.charAt(i);
                else
                odd=odd+s1.charAt(i);
            }
            System.out.println(even+" "+odd);
            // sc.nextLine();
        }
    }
}
