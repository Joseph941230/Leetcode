class Solution {
    public List<List<Integer>> combine(int n, int k) {
         int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = i + 1;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,nums,new ArrayList<>(),0,k);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, int [] nums, List<Integer> temp,int index,int count){
        if(count == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            dfs(res,nums,temp,i +1, count -1);
            temp.remove(temp.size()-1);
        }
    }
}