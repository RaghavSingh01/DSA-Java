/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1;
        int suff = 1;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            pre *= nums[i];
            res = Math.max(res, pre);
            if(pre == 0){
                pre = 1;
            }

            suff *= nums[nums.length - 1 - i];
            res = Math.max(res, suff);
            if(suff == 0){
                suff = 1;
            }
        }
        return res;
    }
}
// @lc code=end

