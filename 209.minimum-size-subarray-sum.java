/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        
        int res = 0;
        int finalres = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                res = right - left + 1;
                sum -= nums[left];
                left++; 
                if(finalres > res){
                    finalres = res;
                }
            }
        }
        
        return finalres > res? res: finalres;
    }
}
// @lc code=end

