class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices.length==1) return 0;

        int left = 0;
        int right = 1;
        int maxi = 0;
        while(right<=prices.length-1){
            if(prices[left]>prices[right]){
                left=right;
                right++;
            }
            else{
                int profit = prices[right]-prices[left];
                maxi = Math.max(profit, maxi);
                right++;
            }

        }
        return maxi;
    }
}
