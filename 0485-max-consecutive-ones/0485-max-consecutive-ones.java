class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0 ;
        int res = count;
        
        
        
        
        for(int i = 0 ;i < nums.length; i ++){
            if(nums[i] == 1){
            count +=1;
            }else{
                count = 0;
            }
         res = Math.max(res,count);
        }
        return res;
    }
}