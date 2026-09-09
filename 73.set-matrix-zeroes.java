
import java.util.ArrayList;

/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> idx = new ArrayList();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    idx.add(new int[]{i,j});
                }
            }
        }

        for(int[] pos: idx){
            int row = pos[0];
            int col = pos[1];

            for(int i = 0; i < matrix.length; i++){
                matrix[i][col] = 0;
            }
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }
        }
    }
}
// @lc code=end

