class Solution {
    public double findMaxAverage(int[] nums, int k) {
                int currSum = 0;
        double maxSum = -Double.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            currSum += num;

            if(i > k - 1) {
                currSum -= nums[i - k];
            }

            if(i >= k - 1) {
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum / k;
    }
}