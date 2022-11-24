class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> a = new HashMap<Character,Integer>();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            a.put(ch,a.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i< s.length(); i++) {
            if (a.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}