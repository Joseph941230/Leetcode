class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res,nums,new ArrayList<>(),new HashSet<>());
        return res;
    }
    
    private void dfs(List<List<Integer>> res,int[] nums,List<Integer>temp,HashSet<Integer>visited){
        if(temp.size() == nums.length){
        res.add(new ArrayList<>(temp));
        return;
    }
    for(int i = 0; i < nums.length; i++){
        if(visited.contains(i)) continue;
        if(i > 0 && nums[i] == nums[i - 1] && !visited.contains(i - 1)) continue;
        temp.add(nums[i]);
        visited.add(i);
        dfs(res,nums,temp,visited);
        temp.remove(temp.size() - 1);
        visited.remove(i);
    }
    }
}
