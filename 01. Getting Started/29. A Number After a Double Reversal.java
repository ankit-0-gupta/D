// A Number After a Double Reversal.

// https://leetcode.com/problems/a-number-after-a-double-reversal/


class Solution 
{
    public boolean isSameAfterReversals(int num) 
    {
        return (num == 0 || num % 10 != 0) ? true : false;
    }
}
