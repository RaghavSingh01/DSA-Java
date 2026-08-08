/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
                if(sum >= 0){
                    sum += nums[i];
                    maxSum = Math.max(maxSum, sum);
                }
                else if (sum < 0){
                    sum = nums[i];
                    maxSum = Math.max(maxSum, sum);
                }
        }
        return maxSum;
    }
    }

// @lc code=end

