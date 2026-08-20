/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int expectedSum = (n*(n+1))/2;
        int ans = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        ans = expectedSum - sum;
        return ans;
    }
}
// @lc code=end

