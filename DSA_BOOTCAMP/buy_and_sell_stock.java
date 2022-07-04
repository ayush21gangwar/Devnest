public static int solve(int n, int[] prices){
    //CODE HERE 
     int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < minPrice)
                    minPrice = prices[i];
                else if(prices[i] - minPrice > maxProfit)
                    maxProfit = prices[i] - minPrice;
            }
            return maxProfit;
    } 
    

