/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start


class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = nums.clone();
        int i = 0;
        if(k >= nums.length){
            i = k % nums.length;
        }
        else{
            i = k;
        }
        int j = 0;
        while(i < nums.length && j < nums.length){
            nums[i] = res[j];
            if(i == nums.length - 1){
                nums[i] = res[j];
                i = 0;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}
// @lc code=end

