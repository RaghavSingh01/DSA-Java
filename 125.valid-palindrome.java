/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();

        for (char c: s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                list.add(Character.toLowerCase(c));
            }
        }

        if(list.isEmpty() || list.size() == 1){
            return true;
        }

        int i = 0; 
        int j = list.size() - 1;
        boolean flag = false;

        while(i < j){
            if(list.get(i) == list.get(j)){
                flag = true;
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return flag;
    }
}
// @lc code=end

