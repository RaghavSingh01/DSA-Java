/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start




class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        while(i < nums.length && j < nums.length){
            if(nums[i] == nums[j]){
                j++;
            }
            else if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
// @lc code=end

