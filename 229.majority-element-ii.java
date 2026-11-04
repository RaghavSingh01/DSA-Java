    /*
    * @lc app=leetcode id=229 lang=java
    *
    * [229] Majority Element II
    */

    // @lc code=start

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.HashMap;
import java.util.List;
import java.util.Map;

    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            Map<Integer,Integer> tempMap = new HashMap<>();

            List<Integer> res = new ArrayList<>();
            int count = nums.length/3;

            if(nums.length < 2){
                return Arrays.stream(nums).boxed().toList();
            }
            else if(nums.length == 2){
                if(nums[0] == nums[1]){
                    res.add(nums[0]);
                    return res;
                }
                else{
                    return Arrays.stream(nums).boxed().toList();
                }
            }

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

