// Fibonacci Number.

// https://leetcode.com/problems/fibonacci-number/


class Solution 
{
    public int fib(int n) 
    {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int f0 = 0;
        int f1 = 1;
        int nextTerm = 0;
        for(int i = 2; i <= n; i++)
        {
            nextTerm = f0 + f1;
            f0 = f1;
            f1 = nextTerm;
        }
        return nextTerm;
    }
}
