class Solution {
    public boolean validPalindrome(String s) {
        int l = 0,r = s.length() -1;
        while(l<r)
        {
            if(s.charAt(l) == s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return ispal(s,l+1,r)||ispal(s,l,r-1);
            }
        }
        return true;
    }
    boolean ispal(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l) != s.charAt(r))return false;
            
                l++;
                r--;
        }
        return true;
    }
}