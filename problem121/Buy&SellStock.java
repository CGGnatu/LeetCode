class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<len;i++){
            if(prices[i]<minprice) 
                minprice=prices[i];
            else if(prices[i]-minprice>maxprofit) 
                maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}
