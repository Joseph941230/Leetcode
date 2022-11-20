
class Solution {
    public boolean isPalindrome(String s) {
       String a = s.replaceAll("[^a-zA-Z0-9]", " "); 
       String b =a.replaceAll("\\s", "");
       String c = b.toLowerCase();
  int i = 0;
  int j = c.length()-1;
  
  while(i<j){

  if(c.charAt(i) !=c.charAt(j))
      return false;

      i++;
      j--;
  }
  return true;
    }       
       
}
