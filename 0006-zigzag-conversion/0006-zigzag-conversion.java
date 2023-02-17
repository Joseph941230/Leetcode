class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }

        int i = 0;
        while(i < s.length()){
            int rowIndex = 0;
            while(i < s.length() && rowIndex <= numRows - 1){
                sbs[rowIndex].append(s.charAt(i));
                i++;
                rowIndex++;
            }
            rowIndex -= 2;
            while(i < s.length() && rowIndex >= 1){
                sbs[rowIndex].append(s.charAt(i));
                i++;
                rowIndex--;
            }
        }

        for(int j = 1; j < numRows; j++){
            sbs[0].append(sbs[j].toString());
        }

        return sbs[0].toString();
    }
}