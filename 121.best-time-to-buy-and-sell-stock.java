/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int minPrice = prices[0];
        for(int price: prices){
            int profit = price - minPrice;
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
// @lc code=end

