class Solution {
   public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) {
  	return ans;
  }
        ArrayList<Integer> subset = new ArrayList<Integer>();
        search(ans, subset, nums, 0);
        return ans;
    }
 private void search(ArrayList<List<Integer>> ans, ArrayList<Integer> subset, int[] nums, int pos){
        ans.add(new ArrayList<Integer>(subset));
        for(int i = pos; i < nums.length; i++){
            subset.add(nums[i]);
            search(ans, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
 }
}