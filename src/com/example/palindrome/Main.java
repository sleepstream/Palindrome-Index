package com.example.palindrome;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the palindromeIndex function below.
    private static int palindromeIndex(String s) {
        int index =-1;

        StringBuilder inputString = new StringBuilder(s);
        for(int i =0; i< inputString.length()/2; i++)
        {
            int tmp = inputString.length() - i-1;
            if(inputString.charAt(i) != inputString.charAt(tmp))
            {
                if( inputString.charAt(i) == inputString.charAt(tmp-1) && inputString.charAt(i+1) == inputString.charAt(tmp-2))
                    return tmp;
                else
                    return i;
            }
        }

        return index;

    }

    private static final InputStreamReader isr=new InputStreamReader(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Hello");
        int q = Integer.valueOf(br.readLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = br.readLine();

            int result = palindromeIndex(s);

            System.out.println(result);
        }

    }
}