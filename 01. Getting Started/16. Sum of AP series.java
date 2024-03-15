// Sum Of AP Series.

// https://www.geeksforgeeks.org/problems/sum-of-ap-series4512/1


class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += a;
            a += d;
        }
        return sum;
    }
}
