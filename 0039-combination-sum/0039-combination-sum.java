class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,res,target,new ArrayList<Integer>(),0);
        return res;
    }
    public void dfs(int[]nums,List<List<Integer>> res, int target, List<Integer> temp , int start){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            dfs(nums, res, target - nums[i], temp, i);
            temp.remove(temp.size() - 1);
        }
    
    }
}