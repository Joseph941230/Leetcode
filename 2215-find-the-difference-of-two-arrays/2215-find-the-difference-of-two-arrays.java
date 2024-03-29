class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for ( int i = 0; i < nums1.length; i ++){
         
            set1.add(nums1[i]);
        
        }
        for (int i = 0; i < nums2.length; i ++){
             set2.add(nums2[i]);
        
        }
        
        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();
        
        for(int i = 0; i <nums1.length; i ++){
            if(!set2.contains(nums1[i])){
                ans1.add(nums1[i]);
            }
        }
        for(int i = 0; i <nums2.length; i ++){
            if(!set1.contains(nums2[i])){
                ans2.add(nums2[i]);
            }
        }
            
            List<List< Integer>> ans = new ArrayList<>();
           
            ans.add(ans1.stream().collect(Collectors.toList()));
            ans.add(ans2.stream().collect(Collectors.toList()));
            return ans;
            
        }     
            
           
        
        
        
    
}