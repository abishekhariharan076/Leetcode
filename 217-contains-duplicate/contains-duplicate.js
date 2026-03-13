/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    	const mySets = {};
    for (let i = 0; i < nums.length; i++){
        if (mySets[nums[i]]){
            return true;
        }
        mySets[nums[i]] = true;
    }
    return false;
};