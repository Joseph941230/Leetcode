class Solution {
    class Node {
        int p1;
        int p2;
    }
    
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        Node[][] dp = new Node[len][len];
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                dp[i][j] = new Node();
            }
        } 
        
        for(int i = 0; i < len; i++){
            dp[i][i].p1 = nums[i];
        }
        
        for(int l = 2; l <= len; l++){
            for(int i = 0; i <= len - l; i++){
                int j = i + l - 1;
                
                int startSelect = nums[i] + dp[i + 1][j].p2;
                int endSelect = nums[j] + dp[i][j - 1].p2;
                
                if(startSelect > endSelect){
                    dp[i][j].p1 = startSelect;
                    dp[i][j].p2 = dp[i + 1][j].p1;
                }else{
                    dp[i][j].p1 = endSelect;
                    dp[i][j].p2 = dp[i][j - 1].p1;
                }
            }
        }
        
        Node res = dp[0][len - 1];
        
        return res.p1 >= res.p2;
        
    }
}