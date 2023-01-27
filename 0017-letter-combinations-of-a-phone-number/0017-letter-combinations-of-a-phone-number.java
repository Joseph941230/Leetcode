class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        
        Queue<String> queue = new LinkedList<>();
        String [] dict = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        queue.offer("");
        
        for(int i = 0 ; i < digits.length(); i++){
           int index = digits.charAt(i) - '0';
            String curr = dict[index];
            while(queue.peek().length() == i) {
                String temp = queue.poll();
                for(char c : curr.toCharArray()){                  
                    queue.offer(temp + String.valueOf(c));
                }
            }
        }
        
        return new ArrayList<>(queue); 
        }
    
}