class Solution {
    public int[] sortedSquares(int[] nums) {
       // if(nums.length == null) return 0;
        int []temp = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length -1 ; i >= 0; i--){
           int left1 = nums[left];
            int right1 = nums[right];
            if(Math.abs(left1) > Math.abs(right1)){
                temp[i] = left1 * left1;
                left++;
            }else{
            temp[i] = right1 * right1 ; 
                right--;
            }
        
        }
        return temp;
    }
}