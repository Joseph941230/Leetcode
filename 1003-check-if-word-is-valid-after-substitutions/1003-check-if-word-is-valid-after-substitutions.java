class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                if (stack.empty() || stack.pop() != 'b')
                    return false;
                if (stack.empty() || stack.pop() != 'a')
                    return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}