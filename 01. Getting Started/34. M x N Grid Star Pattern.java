// M x N Grid Star Pattern.

// Sample Input 0:
// m = 3, n = 4
    
// Sample Output 0:
// ****
// ****
// ****

// Sample Input 1:
// m = 4, n = 3
    
// Sample Output 1:
// ***
// ***
// ***
// ***


import java.util.*;
public class Main 
{
    public static void gridStarPattern(int m, int n)
    {
        int nst = n;
        for(int row = 1; row <= m; row++)
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
        int m = scn.nextInt();
        int n = scn.nextInt();
        gridStarPattern(m, n);
    }
}
