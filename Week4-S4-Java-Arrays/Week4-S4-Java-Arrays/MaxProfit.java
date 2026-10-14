public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int lowest = prices[0];
        int bestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowest) lowest = prices[i];
            int profit = prices[i] - lowest;
            if (profit > bestProfit) bestProfit = profit;
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
