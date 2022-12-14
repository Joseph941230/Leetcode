class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length +1][amount + 1];
            
            for(int i = 1; i <= coins.length; i++){
                dp[i][0] = 1;
                int currCoin = coins[i-1];
                
                for(int j = 1; j <= amount; j++){
                
                dp[i][j] = dp[i - 1][j];

                if(j >= currCoin) {
                    dp[i][j] += dp[i][j - currCoin];
                }
            }
        }

        return dp[coins.length][amount];
            }
            
            
    }
