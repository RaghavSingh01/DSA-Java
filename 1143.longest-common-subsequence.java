/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int count = 0;
        
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int m = t1.length;
        int n = t2.length;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            map.put(t1[i],i);
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(t2[i])){
                if(idx <= map.get(t2[i])){
                    idx = map.get(t2[i]);
                    count++;
                }
            }
        }
        return count;
        
    }
}
// @lc code=end

