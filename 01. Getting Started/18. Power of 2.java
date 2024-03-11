// Power of 2.

// https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1


class Solution
{
    public static boolean isPowerofTwo(long n)
    {
        long power = 1;
        while(power < n)
        {
            power *= 2;
        }
        return (power == n);
    }
}
