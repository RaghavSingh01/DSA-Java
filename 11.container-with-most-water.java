/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // int h = height[0];
        // int b = 1;
        int area = 0;

        int i = 0; 
        int j = height.length - 1;

        while(i < j){
            int currArea = 0;
            if(height[i] <= height[j]){
                currArea = height[i] * (j - i);
                area = Math.max(area, currArea);
                i++;
            }
            else{
                currArea = height[j] * (j - i);
                area = Math.max(area, currArea);
                j--;
            }
        }
        return area;
    }
}
// @lc code=end

