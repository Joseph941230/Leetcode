class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       if(nums == null || nums.length == 0) {
           return 0;
       }
        int count = 0;
        int res = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1){
                count +=1;
            }else{
                res = Math.max(res,count);
                count = 0;
            }
        }
        return Math.max(count,res);
    }
}