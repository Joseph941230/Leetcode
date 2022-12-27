class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] tails = new int[nums.length + 1];
            Arrays.fill(tails, Integer.MAX_VALUE);
        
        for( int num : nums){
            int index = helper(tails,num);
            tails[index] = num;
        }
        int res =0;
        
        for(int num: tails){
            if(num != Integer.MAX_VALUE){
                res++;
            }
        }
        return res;
            
            
    }           
            
            
            
         private int helper(int[] nums, int target){
            int l = 0;
            int r = nums.length-1;
            
            while(l +1 < r){
                int mid = l+(r-l)/2;
                
                if(nums[mid] == target) return mid;
                
                if(nums[mid] < target){
                    l = mid;
                }else{
                    r = mid;;
                }
            }
            return r;
        }   
    
}