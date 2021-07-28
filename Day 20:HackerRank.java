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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();
         

        for (int i=0;i< n;i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }
        bufferedReader.close();
    
    int numberOfSwaps = 0;
    for (int i = 0; i < n; i++) {   
    
    for (int j = 0; j < n - 1; j++) {
        if (Integer.parseInt(aTemp[j])>Integer.parseInt(aTemp[j + 1])) {
            String temp=aTemp[j];
            aTemp[j]=aTemp[j+1];
            aTemp[j+1]=temp;
            numberOfSwaps++;
        }
    }
    if (numberOfSwaps == 0) {
        break;
    }
    }
   
    System.out.println("Array is sorted in "+ numberOfSwaps+ " swaps.");
    System.out.println("First Element: "+ aTemp[0]);
    System.out.println("Last Element: "+ aTemp[n-1]);
}
}
