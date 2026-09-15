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
        Map<Character, Integer> mapT = new HashMap<>();
        boolean flag = false;

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for(char c: charS){
            mapS.put(c, mapS.getOrDefault(c,0) + 1);
        }

        for(char c: charT){
            mapT.put(c, mapT.getOrDefault(c,0) + 1);
        }

        if(charS.length != charT.length){
            return false;
        }

        for(char c: charT){
            if(mapS.containsKey(c)){
                if(mapS.get(c) == mapT.get(c)){
                    flag = true;
                }
            }
            else{
                flag = false;
                break;
            }
        }

        return flag;
    }
}
// @lc code=end

