/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int right = nums.length - 1;
        int i = right - 1;

        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0){
            int j = right;
            while(nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            reverse(nums, i+1, right);
        }
        else{
        reverse(nums, 0, right);
        }
    }

    public static String reverse(int[] arr, int left, int high){
        // int left = 0;
        // int high = arr.length - 1;

        while(left <= high){
            int temp = arr[left];
            arr[left] = arr[high];
            arr[high] = temp;
            left++;
            high--;
        }
        return Arrays.toString(arr);
    }
}
// @lc code=end

