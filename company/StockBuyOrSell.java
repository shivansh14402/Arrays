package com.company;

public class StockBuyOrSell {

    static int StockMaxProfit(int[] price, int start, int end){
        if(start>=end){
            return 0;
        }
        int profit = 0;
        for(int i=0;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(price[j]>price[i]){
                    int currProfit = (price[j]-price[i])+StockMaxProfit(price,start,i-1)+StockMaxProfit(price,j+1,end);
                    if(profit<currProfit){
                        profit = currProfit;
                    }
                }
            }
        }
        return profit;
    }

    static  int StockMaxProfit2(int[] price, int n){
        int profit = 0;

        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit += price[i]-price[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] price = {1,5,3,8,12};
        System.out.print(StockMaxProfit2(price,5));
    }

}
