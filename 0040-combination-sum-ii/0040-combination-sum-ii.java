class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
     private void dfs(List<List<Integer>> res,
                        int[] nums,
                        int target,
                        List<Integer> temp,
                        int start){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < nums.length; i++){
          
            if(i != start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            dfs(res, nums, target - nums[i], temp, i + 1);
            temp.remove(temp.size() - 1);
        }
}
     }