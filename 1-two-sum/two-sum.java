class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap < Integer,Integer> complement =  new HashMap <> ();
        for(int i = 0;i<nums.length;i++)
        {
            if(complement.containsKey(nums[i]))
            {
                return new int[] {complement.get(nums[i]),i};
            }
            int subs = target - nums[i];
            complement.put(subs,i);
        }
         return new int[] {};
    }
    
}