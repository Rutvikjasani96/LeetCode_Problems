public class Problem_121 {
//    Best Time to Buy and Sell Stock
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("profit : "+maxProfit(prices));
    }
    static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i< prices.length;i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
