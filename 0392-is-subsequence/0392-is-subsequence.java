class Solution {
    public boolean isSubsequence(String s, String t) {
        int checkedIndex = 0;
        char[] sub = s.toCharArray();
        char[] str = t.toCharArray();
        for(int i=0; i<sub.length; i++){
            boolean found = false;
            for(int j=0; j<str.length; j++){
                if(sub[i] == str[j] && checkedIndex <= j){
                    checkedIndex = j;
                    str[j] = '*';
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}