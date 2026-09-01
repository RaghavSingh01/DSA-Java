/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;

        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }
        }
        while(left < right){
            if(nums[left] == target) return left;
            if(nums[right] == target) return right;
            if(nums[mid] == target) return mid;
            if(nums[mid] <= nums[right]){
                if (target <= nums[right] && target >= nums[mid]){
                    left = mid + 1;
                    mid = left + (right - left)/2;
                }
                else{
                    right = mid;
                    mid = left + (right - left)/2;
                }
            }
            else if(nums[mid] >= nums[left]){
                // right = mid;
                // mid = left + (right - left)/2;
                if(target >= nums[left] && target <= nums[mid]){
                    right = mid - 1;
                    mid = left + (right - left)/2;
                }
                else{
                    left = mid + 1;
                    mid = left + (right - left)/2;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

