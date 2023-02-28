class Solution {
    public String capitalizeTitle(String title) {
   StringBuilder sb = new  StringBuilder();
        String [] str = title.split(" ");
        for(int i = 0; i < str.length; i++){
            String s = str[i].toLowerCase();
            if(s.length()>=3){
                sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1));
            }else{
                sb.append(s);
            }
            if(i !=str.length - 1) sb.append(" ");
        }
        return sb.toString();
    }  
}