class Solution {
    public int reverse(int x) {
        int y = x;
        long rnum = 0;
        while(y!=0)
        {
            int digit = y % 10;
            rnum=rnum*10+digit;
            y = y/10;
        }
        if((rnum>Integer.MAX_VALUE)||(rnum<Integer.MIN_VALUE))
        return 0;


        return (int)rnum ;
    }
    
}