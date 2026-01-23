class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);

        int maxnum = num;
        for(char c : s.toCharArray())
        {
            if(c!='9')
            {
                maxnum = Integer.parseInt(s.replace(c,'9'));
                break;
            }
        }
        int minnum = num;
        char first = s.charAt(0);
        if(first != '1')
        {
            minnum = Integer.parseInt(s.replace(first,'1'));
        }
        else
        {
            for(int i =1;i<s.length();i++)
            {
                char c = s.charAt(i);
                if(c != '0' && c != '1')
                {
                    minnum = Integer.parseInt(s.replace(c, '0'));
                    break;
                }
            }
        }
        return maxnum - minnum;
    }
}