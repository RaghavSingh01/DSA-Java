/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> freqMap = new HashSet<>();
        for (int i: nums){
            if(freqMap.contains(i)){
                return true;
            }
            else{
                freqMap.add(i);
            }
        }
        return false;
    }
}
// @lc code=end

