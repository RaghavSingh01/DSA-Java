/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;
        int n = nums.length;

        while(i < n - 1 && j < n){
            
            if(nums[i] == 0){
                if(nums[j] != nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j = i + 1;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j = i + 1;
            }
        }
    }
}
// @lc code=end

