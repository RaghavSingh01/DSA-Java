/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for(char c: charS){
            mapS.put(c, mapS.getOrDefault(c,0) + 1);
        }

        if(charS.length != charT.length){
            return false;
        }

        for(char c: charT){
            if(mapS.containsKey(c)){
                if(mapS.get(c).intValue() <= 0){
                    return false;
                }
                else{
                    mapS.put(c, mapS.get(c) - 1);
                }
            }
            else{
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

