class NumArray {
    List<Integer> sum = new ArrayList<>();
    public NumArray(int[] nums) {
        sum.add(0);
        int acc = 0;
        for (int i = 0; i < nums.length; i++) {
            acc += nums[i];
            sum.add(acc);
        }
    }

    public int sumRange(int i, int j) {
        return sum.get(j + 1) - sum.get(i);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */