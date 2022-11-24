class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for ( int i= 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int miss = -1;
        for ( int i = 0; i<= nums.length;i++){
            if(!set.contains(i)) {
                miss =i;
                break;
            }
        }
        return miss;
    }
}