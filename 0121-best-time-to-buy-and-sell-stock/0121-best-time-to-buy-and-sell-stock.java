class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<b){
                b=prices[i];
            }else if(prices[i]-b>max){
                max=prices[i]-b;
            }
        }
        return max;


        
    }
}