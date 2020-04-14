/*Given the stock price of n days, the trader is allowed to buy a share and sell it afterwards (selling can only be done after the buying). 
Find out the maximum profit that a share trader could have made.*/

class Playground {
    public static void main(String[ ] args) {
      int[] stockPrices = new int[] {10, 6,4}; //result is -2. Buys at 6, sells at 4.
      System.out.println(getMaxProfit(stockPrices));
    }
    
    private static int getMaxProfit(int[] stockPrices){
        
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }
        int minPrice = stockPrices[0];
        int largestProfit = stockPrices[1] - stockPrices[0];
        
        for(int i = 1; i < stockPrices.length ; i++){
            if(largestProfit < (stockPrices[i] - minPrice)){
                largestProfit = stockPrices[i] - minPrice;
            }
            
            if(stockPrices[i] < minPrice){
                minPrice = stockPrices[i];
            }

        }
        return largestProfit;
    
    }
}