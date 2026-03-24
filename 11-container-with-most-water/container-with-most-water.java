class Solution {
    public int maxArea(int[] height) {
        int resul = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            resul = Math.max(area, resul);
            
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return resul;
    }
}