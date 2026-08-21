/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum  = 0;
        int maxSum = nums[0];
        int i = 0;

        while(i < nums.length){
            if(sum < 0 && nums[i] >= 0){
                sum = nums[i];
                maxSum = Math.max(sum, maxSum);    
            }else{
                sum += nums[i];
                maxSum = Math.max(Math.max(sum,nums[i]), maxSum);
            }
            if(sum < maxSum && sum < 0){
                sum = 0; 
            }
           i++;
        }
        return maxSum;
    }
    }

// @lc code=end

