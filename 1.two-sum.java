/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> num = new HashMap<>();
        
        for(int k = 0; k < nums.length; k++){
            num.computeIfAbsent(nums[k], x-> new ArrayList<>()).add(k);
        }

        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            
                if (num.containsKey(needed)) {

                    ArrayList<Integer> indices = num.get(needed);
   
                        if(nums[i] != needed){
                            return new int[]{
                                num.get(nums[i]).get(0),
                                indices.get(0)
                                };
                            }
                        if(indices.size() > 1){
                            return new int[]{
                                indices.get(0),
                                indices.get(1)
                            };
                        }
                    }
        }
        return new int[]{};
    }
}
    

// @lc code=end

