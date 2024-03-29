class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String sorted = helper(str);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for(List<String> temp : map.values()){
            res.add(temp);
        }

        return res;
    }

    private String helper(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}