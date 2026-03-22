class Solution {
    public int[] twoSum(int[] numbers, int target) {
       for (int i = 0, j = numbers.length - 1; i < j; ) {
            int su = numbers[i] + numbers[j];
            if (su == target) {
                return new int[]{i + 1, j + 1};
            } else if (su < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}