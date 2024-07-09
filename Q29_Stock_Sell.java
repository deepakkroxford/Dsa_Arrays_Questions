class stock {
    public static int maxProfit(int price[]) {
        int max = 0;
        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                if ((price[j] - price[i]) > max) {
                    max = price[j] - price[i];
                }
            }
        }
        return max;
    }
    public static int maxProfitOn(int price[])
    {
        int buyprice = price [0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++)
        {
            if(price[i]<buyprice)
            {
                buyprice=price[i];
            }
            else{
                int currentprice = price[i]-buyprice;
                maxProfit = Math.max(maxProfit,currentprice);
            }
        }
        return maxProfit;
    }
}

public class Q29_Stock_Sell {
    public static void main(String[] args) {
        /*
         * You are given an array prices where prices[i] is the price of a given stock
         * on the ith day.
         * 
         * You want to maximize your profit by choosing a single day to buy one stock
         * and choosing a different day in the future to sell that stock.
         * 
         * Return the maximum profit you can achieve from this transaction. If you
         * cannot achieve any profit, return 0.
         * 
         * 
         * 
         * Example 1:
         * Input: prices = [7,1,5,3,6,4]
         * Output: 5
         * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
         * 6-1 = 5.
         * Note that buying on day 2 and selling on day 1 is not allowed because you
         * must buy before you sell.
         * 
         * Example 2:
         * Input: prices = [7,6,4,3,1]
         * Output: 0
         * Explanation: In this case, no transactions are done and the max profit = 0.
         * 
         * 
         * Constraints:
         * 
         * 1 <= prices.length <= 105
         * 0 <= prices[i] <= 104
         */

         int arr[] = {7,1,5,3,6,4};
         System.out.println(stock.maxProfit(arr));

         int arr2 []={7,6,4,3,1};
         System.out.println(stock.maxProfitOn(arr2));
    }
}
