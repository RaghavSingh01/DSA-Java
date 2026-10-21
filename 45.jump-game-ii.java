/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == end) {
                count++;
                end = farthest;

                if (end >= nums.length - 1) {
                    return count;
                }
            }
        }

        return count;
    }
}
// @lc code=end

