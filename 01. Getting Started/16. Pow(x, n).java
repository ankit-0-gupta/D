// Pow(x, n).

// https://leetcode.com/problems/powx-n/


class Solution 
{
    public double myPow(double x, int n) 
    {
        double pow = 1.0;
        long nn = n;
        if(nn < 0) nn = -1 * nn;
        while(nn != 0)
        {
            if(nn % 2 == 0)
            {
                x *= x;
                nn /= 2;
            }
            else
            {
                pow *= x;
                nn--;
            }
        }   
        if(n < 0) 
        {
            pow = 1 / pow;
        }
        return pow;
    }
}
