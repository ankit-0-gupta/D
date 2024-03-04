// Ninja And The Star Pattern I.

// https://www.codingninjas.com/studio/problems/ninja-and-the-star-pattern-i_6581920


public class Solution
{
    public static void getStarPattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
