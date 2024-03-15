// Sum of Series.

// https://www.geeksforgeeks.org/problems/sum-of-series2811/1


class Solution
{
    public static long seriesSum(int n)
    {
        // Approach 1.
        
        // long sum = 0;
        // for(int i = 1; i <= n; i++)
        // {
        //     sum += i;
        // }
        // return sum;
        
        
        // Approach 2.
        
        long sum = ((long)n * ((long)n + 1)) / 2;
        return sum;
    }
}
