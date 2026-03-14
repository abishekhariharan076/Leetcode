class Solution {
    public boolean isAnagram(String s, String t) 
    {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()!=t.length()) return false;
        int coun[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
                char chs=s.charAt(i);
                char cht=t.charAt(i);
                coun[chs-'a']++;
                coun[cht-'a']--;
        }
        for(int i=0;i<coun.length;i++)
        {
            if(coun[i]!=0) return false;
        }
        return true;
    }
}