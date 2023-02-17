class Solution {
    public int strStr(String haystack, String needle) {
    for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                while(j < needle.length()){
                    if(haystack.charAt(i + j) != needle.charAt(j)) break;
                    j++;
                }

                if(j == needle.length()){
                    return i;
                }
            }
        }

        return -1;
    }
}