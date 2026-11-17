
import java.util.*;

/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> tempMap = new HashMap<>();

            List<Integer> res = new ArrayList<>();
            int count = 1;

            for(int i = 0; i < nums.length; i++){
                if(tempMap.containsKey(nums[i])){
                    tempMap.put(nums[i], tempMap.get(nums[i]) + 1);
                    if(tempMap.get(nums[i]) > count && !res.contains(nums[i])){
                        res.add(nums[i]);
                    }
                }
                else{
                    tempMap.put(nums[i], 1);
                }


            }
            return res;
    }
}
// @lc code=end

