class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return list;
        }
        Arrays.sort(nums);
        for (int first = 0; first < nums.length; first++) {
            if (nums[first] > 0) {
                return list;
            }
            if (first != 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int target = -nums[first];
            int second = first + 1; int third = nums.length - 1;
            while (second < third) {
                int sum = nums[second] + nums[third];
                if (target == sum) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    list.add(temp);
                    while (second < third && nums[second] == nums[second + 1]) {
                        second++;
                    }
                    while (second < third && nums[third] == nums[third - 1]) {
                        third--;
                    }
                    second++;
                    third--;
                }
                else if (sum < target) {
                    second++;
                } else {
                    third--;
                }
            }
        }
        return list;
    }
}