/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int i = 0;
        int j = 1;

        while(i < matrix.length && j < matrix.length){
            if(j == matrix.length - 1){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                i++;
                j = i + 1;
            }
            else{
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                j++; 
            }
        }

        int k = 0;

        while(k < matrix.length){
            int left = 0;
            int right = matrix.length - 1;

            while(left < right){
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
                left++;
                right--;
            }
            k++;
        }
        // return matrix;

    }
}
// @lc code=end

