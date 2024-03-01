// N x N Star Rectangle.

// Sample Input:
// 6
  
// Sample Output:
// ******
// ******
// ******
// ******
// ******
// ******


import java.io.*;
import java.util.*;
public class Solution 
{
    public static void rectanglePattern(int n)
    {
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        rectanglePattern(n);
    }
}
