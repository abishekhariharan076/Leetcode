class Solution {
    public boolean isPalindrome(String s) {
        String x = "";
        int jm=0;
        if(s.length()==1)
        {
            return true;
        }
    for(int i=0;i<s.length();i++)
    {
        if((s.charAt(i) >= 'a'&& s.charAt(i) <= 'z')||(s.charAt(i) >= 'A'&& s.charAt(i) <= 'Z')||
        (s.charAt(i) >= '0'&& s.charAt(i) <= '9'))
        {
            x +=Character.toLowerCase(s.charAt(i));
            jm++;
        }
    }
    int i=0,k=x.length()-1;
    System.out.print(x);
    while(i<k)
    {
        if(x.charAt(i)==x.charAt(k))
        {

            i++;
            k--;
        }
        else
        return false;
    }
    return true;
    }
}