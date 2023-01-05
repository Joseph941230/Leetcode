class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        dfs(list, new ArrayList<>(), nums);
            return list;
    }
    
    private void dfs(List<List<Integer>>list, List<Integer>tempList, int [] nums){
     if(tempList.size() == nums.length){   
    list.add(new ArrayList<>(tempList));
        return;
    }
   for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            dfs(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
}
}