package test;

public class MinNoOfCoints {

	public static void main(String[] args) {
		
		int coins[] = {9,6,6,1};
		int noOfTotalCoins = coins.length;
		int valueOfCoin = 13;
		System.out.println(minCoins(coins, noOfTotalCoins, valueOfCoin));
	}
	
	public static int minCoins(int [] coins, int noOfTotalCoins, int valueOfCoin ){
		
		if(valueOfCoin == 0)
			return 0;
		int result =Integer.MAX_VALUE;
		
		for(int i=0; i< noOfTotalCoins;i ++){
			if(coins[i] <= valueOfCoin){
				
				int subResult = minCoins(coins, noOfTotalCoins, valueOfCoin-coins[i]);
				if(subResult != Integer.MAX_VALUE && subResult+1 < result){
					result =subResult+1;
				}
			}
			
		}
		
		return result;
	}
}
