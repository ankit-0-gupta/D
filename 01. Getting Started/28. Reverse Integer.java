// Reverse Integer.

// https://leetcode.com/problems/reverse-integer/


class Solution 
{
    public int reverse(int x) 
    {
        int reverse = 0;   
        while(x != 0)   
        {
            int digit = x % 10;
            int newReverse = reverse * 10 + digit;
            if(newReverse / 10 != reverse)
            {
                return 0;
            }
            reverse = newReverse;
            x /= 10;
        } 
        return reverse;
    }
}
