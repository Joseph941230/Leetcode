class Solution {
    public static final String[] MORSE ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> a = new HashSet<String>();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (int i = 0;i < word.length(); i++){
                char c = word.charAt(i);
                code.append(MORSE[c-'a']);
            }
            a.add(code.toString());
        }
        return a.size();
        
    }
    
}