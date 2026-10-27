/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLeft = 0;

        for(int i = 0; i < gas.length; i++){
            if(gas[i] >= cost[i]){
                int start = i;
                gasLeft = 0;
                int count = 0;
                for(int j = i; j < gas.length; j++){
                    count++;
                    gasLeft = gasLeft + gas[j] - cost[j];
                    if(gasLeft < 0){
                        if(count == gas.length){
                            return -1;
                        }
                        if (j < start) {
                            return -1;
                        }
                        i = j;
                        break;
                    }
                    else if(gasLeft >= 0 && count == gas.length){
                        return start;
                    }
                    if(j == gas.length - 1){
                        j = -1;
                    }
                }
            }
        }
        return -1;
    }
}
// @lc code=end

