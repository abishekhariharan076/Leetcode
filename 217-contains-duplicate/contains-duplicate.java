class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seennumbers = new HashSet<>();
        for(int num : nums){
            if(seennumbers.contains(num))
            {
                return true;
            }
            seennumbers.add(num);
        }
        return false;
    }
}