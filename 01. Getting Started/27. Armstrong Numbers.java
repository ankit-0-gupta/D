// Armstrong Numbers.

// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1


class Solution 
{
    static String armstrongNumber(int n)
    {
        int num = n;
        int sum = 0;
        while(num != 0)
        {
            int digit = num % 10;
            sum += (digit * digit * digit);
            num /= 10;
        }
        return (sum == n) ? "Yes" : "No";
    }
}
