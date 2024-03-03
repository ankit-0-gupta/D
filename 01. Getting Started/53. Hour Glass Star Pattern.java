// Hour Glass Star Pattern.

// Sample Input:
// 7

// Sample Output:
// *******
//  *   *
//   * *
//    *
//   ***
//  *****
// *******


import java.util.*;
public class Main 
{
    public static void hourglassPattern(int n)
    {
        int nsp = 0;
        int nst = n;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                if(row > 1 && row <= n / 2 && (cst > 1 && cst < nst))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");                    
                }
            }
            if(row <= n / 2)
            {
                nsp++;
                nst -= 2;
            }
            else
            {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hourglassPattern(n);
    }
}
