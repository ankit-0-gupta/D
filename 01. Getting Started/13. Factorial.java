// Factorial.

// https://www.geeksforgeeks.org/problems/factorial5739/1


class Solution
{
    static long factorial(int N)
    {
        long result = 1;
        for(int i = N; i > 0; i--)
        {
            result *= i;
        }
        return result;
    }
}
