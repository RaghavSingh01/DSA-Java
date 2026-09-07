/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        while(i < nums.length){
            sum += nums[i];
            
            
            int diff = sum - k;
            if(map.containsKey(diff)){
                count = count + map.get(diff);
            }
            
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
                i++;
            }
            else{
                map.put(sum, 1);
                i++;
            }

        }
        return count;
    }
}
// @lc code=end

