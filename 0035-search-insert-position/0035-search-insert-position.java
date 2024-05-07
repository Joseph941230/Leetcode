class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = n;
        while(left <= right){
            int mid = (right - left) /2 + left;
            if(target <= nums[mid]){
                ans = mid;
                right = mid-1;
            }else{
                left = mid +1;
            }
            
        }




        return ans;
    }
}
