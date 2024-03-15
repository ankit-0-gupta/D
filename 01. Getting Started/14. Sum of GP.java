// Sum of GP.

// https://www.geeksforgeeks.org/problems/sum-of-gp2120/1


class Solution
{
    public long sum_of_gp(long n, long a, long r)
    {
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += a;
            a *= r;
        }
        return sum;
    }
}
