class Solution {
    public int maxProfit(int[] prices) {
      int buy = 0;
      int sell = 1;
      int maxProfit = 0;
      // if(prices.length ==2) return prices[sell]-prices[buy];

      while(sell<prices.length){
        if(prices[buy]>prices[sell]){
          buy = sell;
        }else{
          maxProfit = Math.max(maxProfit,prices[sell]-prices[buy]);
        }
        sell++;
      }
      return maxProfit;
    }
}

/**
 * 2 pointer solution
 * p1 = 0, p2=1
 * if(price1>price2) p1 = p2; sell date becomes buy date
 * else profit = price2-price1, compare against maxProfit
 * p2++ advances to next date
 */