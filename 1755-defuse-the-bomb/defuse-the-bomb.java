class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) return new int[code.length];

        int[] ans = new int[code.length];   
        for (int i = 0; i < code.length; i++) {
            int x = Math.abs(k);
            int curr = k > 0 ? i + 1 : i - 1;

            while (x > 0) {
                ans[i] += code[(curr + code.length) % code.length];
                x--;
                curr = k > 0 ? curr + 1 : curr - 1;
            }
        }
        return ans;
    }
}