class Solution {
    public int minSubArrayLen(int target, int[] nums) {
               int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = n + 1;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == n + 1 ? 0 : ans; 
    }
}