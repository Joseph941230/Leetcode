class Solution {
    public boolean search(int[] nums, int target) {
          int left = 0;
        int right = nums.length - 1;

        while(left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return true;

            if(nums[left] <= nums[mid]) {
                if(nums[left] == nums[mid]) {
                    left += 1;
                } else {
                    if(nums[left] <= target && target <= nums[mid]) {
                        right = mid;
                    } else {
                        left = mid;
                    }
                }
            } else {
                if(nums[right] == nums[mid]) {
                    right -= 1;
                } else {
                    if(nums[mid] <= target && target <= nums[right]) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }

        if(nums[left] == target) return true;
        if(nums[right] == target) return true;
        return false;
     
    }
}