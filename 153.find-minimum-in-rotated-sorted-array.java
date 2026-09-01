 /*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;

        while(left <= right){
            if(nums[mid] < nums[right]){
                right = mid;
                mid = left + (right - left)/2;
                min = Math.min(min, nums[mid]);
            }
            else if(left == right){
                return nums[left];
            }
            else{
                left = mid + 1;
                mid = left + (right - left)/2;
                min = Math.min(min, nums[mid]);
            }

        }
        return min;
    }
}
// @lc code=end

