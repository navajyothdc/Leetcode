class Solution {
    public String removeStars(String s) {
        int i = 0; 
        int j = 0;
        char str[] = s.toCharArray();
        for(i = 0; i < str.length; i++){
            if(str[i] == '*'){
                j--;
            } else{
                str[j] = str[i];
                j++;
            }
        }
        s = new String(str);
        return s.substring(0,j);
    }
}