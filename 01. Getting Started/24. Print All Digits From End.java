// Print All Digits From End.

// Sample Input 0:
// 987651
  
// Sample Output 0:
// 1
// 5
// 6
// 7
// 8
// 9

// Sample Input 1:
// 10000
  
// Sample Output 1:
// 0
// 0
// 0
// 0
// 1


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void printDigits(int n)
    {
       while(n != 0)
       {
           int digit = n % 10;
           System.out.println(digit);
           n /= 10;
       }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDigits(n);
    }
}
