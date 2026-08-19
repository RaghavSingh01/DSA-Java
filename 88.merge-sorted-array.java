/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        else if(n == 0){
            return;
        }
       
        int last = m + n - 1;

        int i = m - 1; 
        int j = n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[last] = nums1[i];
                i--;
                last--;
            }
            else{
                nums1[last] = nums2[j];
                j--;
                last--;
            }
        }
        while( j >= 0 ){
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }
}
// @lc code=end

