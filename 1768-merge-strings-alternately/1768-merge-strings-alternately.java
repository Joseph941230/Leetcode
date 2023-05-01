class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder m = new StringBuilder();
        int i = 0;
        int j = 0;
        
        while(i < word1.length() && j < word2.length()){
            m.append(word1.charAt(i++));
       m.append(word2.charAt(j++));
        }
        while(i < word1.length()){
            m.append(word1.charAt(i++));
            
        }
        while(j < word2.length()){
m.append(word2.charAt(j++));
        }
        return m.toString();
    }
    
    
}