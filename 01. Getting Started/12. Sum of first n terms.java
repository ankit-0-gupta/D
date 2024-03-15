// Sum of first n terms.

// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1


class Solution 
{
    long sumOfSeries(long n) 
    {        
        long sum = 0;
        for(long i = 1; i <= n; i++)
        {
            sum += (i * i * i);
        }
        return sum;
    }
}
