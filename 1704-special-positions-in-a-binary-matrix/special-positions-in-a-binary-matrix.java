class Solution {
    public int numSpecial(int[][] mat) {
    //     int ans = 0;
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat[i].length; j++) {
    //             if (mat[i][j] == 1 && check(i, j, mat)) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    //     public boolean check (int a, int b, int[][] mat) {
    //         int c1 = 0;
    //         int c2 = 0;
    //         for (int i = 0; i < mat.length; i++) {
    //             if (mat[i][b] == 1) {
    //                 c1 += 1;
    //             }
    //         }
    //         if (c1 > 1) {
    //             return false;
    //         }
    //         for (int i = 0; i < mat[0].length; i++) {
    //             if (mat[a][i] == 1) {
    //                 c2 += 1;
    //             }
    //         }
    //         if (c2 > 1) {
    //             return false;
    //         }
    //         return true;
        int[] r = new int[mat.length];
        int[] c = new int[mat[0].length];
        int ans =0 ;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++) {
                r[i] += mat[i][j];
                c[j] += mat[i][j];
            } 
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++) 
                if (mat[i][j] == 1)
                    if (r[i] == 1 && c[j] == 1)
                        ans += 1;
        return ans;
    }
}