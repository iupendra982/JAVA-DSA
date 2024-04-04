package Arrays;
import java.util.*;
public class Array_Problems {
    public static int trapped_rain_water(int height[]){
        int n=height.length;
        //calculate left max boundary array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //calculate right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(leftmax bound , rightmax bound)
            int waterLevel=Math.min(leftmax[i],rightMax[i]);

            //trapped water=waterlevel-height[i]
            trappedwater+=waterLevel-height[i];
        }
        return trappedwater;
        //Time Complexity is O(n) most optimum way of doing this problem
    }

    public static int buy_and_sell_stocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){//profit
                int profit=prices[i]-buyPrice;//today's profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped_rain_water(height));

        //buy sell stocks problems
        int prices[]={7,1,5,3,6,4};
        System.out.println(buy_and_sell_stocks(prices));
        
    }
}
