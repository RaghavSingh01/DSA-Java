/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = i + 1;
        int profit = 0;

        while(i < prices.length - 1 && j < prices.length){
            if(prices[i] < prices[j]){
                if(j == prices.length - 1 || prices[j] > prices[j + 1]){
                    profit += (prices[j] - prices[i]);
                    i = j + 1;
                    j = i + 1;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return profit;
    }
}
// @lc code=end

