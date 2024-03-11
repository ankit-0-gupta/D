// FizzBuzz.

// https://www.hackerrank.com/challenges/fizzbuzz/problem


import java.io.*;
import java.util.*;
public class Solution  
{
    public static void main(String[] args) 
    {
        // // Approach 1.
           
        // for(int i = 1; i <= 100; i++)
        // {
        //     if(i % 3 == 0 && i % 5 == 0) 
        //     {
        //         System.out.println("FizzBuzz");
        //     } 
        //     else if(i % 3 == 0)
        //     {
        //         System.out.println("Fizz");
        //     }
        //     else if(i % 5 == 0)
        //     {
        //         System.out.println("Buzz");
        //     }
        //     else
        //     {
        //         System.out.println(i);    
        //     }
        // }
        
        
        // Approach 2.
        
        int fizz = 0;
        int buzz = 0;
        for(int i = 1; i <= 100; i++)
        {
            fizz++;
            buzz++;
            if(fizz == 3 && buzz == 5)
            {
                System.out.println("FizzBuzz");
                fizz = 0;
                buzz = 0;
            }
            else if(fizz == 3)
            {
                System.out.println("Fizz");
                fizz = 0;
            }
            else if(buzz == 5)
            {
                System.out.println("Buzz");
                buzz = 0;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
