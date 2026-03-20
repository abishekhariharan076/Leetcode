class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array
        int i = 0;  // Pointer for the last unique element
        int ji = 1;  // Pointer for the current element to compare
        while (ji < nums.length) {
            if (nums[i] != nums[ji]) {
                i++;              // Move i to the next unique position
                nums[i] = nums[ji]; // Update the element at index i
            }
            ji++; // Continue to the next element
        }
        return i + 1; // New length of the array
    }
}