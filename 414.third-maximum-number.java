

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        // If no third distinct maximum exists, return the largest
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}
// @lc code=end

