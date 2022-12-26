class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
       if(expression == null || expression.length() == 0) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for(int l : left) {
                    for(int r : right){
                        if(c == '+'){
                            res.add(l + r);
                        } else if (c == '-') {
                            res.add(l - r);
                        } else if (c == '*') {
                            res.add(l * r);
                        }
                    }
                }
            }
        }

        if(res.size() == 0){
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}