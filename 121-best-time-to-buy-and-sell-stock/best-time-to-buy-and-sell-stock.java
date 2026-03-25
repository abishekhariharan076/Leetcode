class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profi=0;
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            int cost=prices[i]-min;
            profi=Math.max(profi,cost);
            min=Math.min(min,prices[i]);
        }
        return profi;
    }
}