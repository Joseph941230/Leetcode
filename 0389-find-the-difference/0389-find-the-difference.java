class Solution {
    public char findTheDifference(String s, String t) {
        int sizeS = s.length();
        int sizeT = t.length();

        
        int [] table = new int[26];
        for(int i = 0; i< sizeT; i++){
            if(i < sizeS){
                table[s.charAt(i) - 'a'] ++;
            }
            table[t.charAt(i) - 'a'] --;
        }
        for(int i = 0; i < 26; i ++){
            if(table[i] !=0){
                return (char)('a' +i);
            }
        }
        return 'a';
    }
}