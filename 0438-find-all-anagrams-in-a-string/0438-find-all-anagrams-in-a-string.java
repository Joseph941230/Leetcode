class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
       char a = p.charAt(i);
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
            }else{
                map.put(a, 1);
            }
        
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        List<Integer> ans = new ArrayList<>();
        while(right < s.length()){
            char c = s.charAt(right);
            right++;
            if(map.containsKey(c)) {
                if(map.get(c) > 0) {
                    count--;
                }
                map.put(c, map.get(c) - 1);
            }
            while(count == 0){
                if (right - left == p.length() ) {
                    ans.add(left);
                }
                    char d = s.charAt(left);
                    left++;
                    if(map.containsKey(d)) {
                        if(map.get(d) == 0) {
                            count++;
                        }
                        map.put(d, map.get(d) + 1);
                    }
                }
            }
            return ans;
        }
}
    
