class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, "");
        return result;
    }
    public void generate(int n, int open, int close, String paranthesis){
        if(paranthesis.length() == n*2){
            result.add(paranthesis);
            return;
        }
        if(open<n){
            generate(n, open + 1, close, paranthesis + "(");
        }
        if(close < open){
            generate(n, open, close + 1, paranthesis + ")");
        }
    }
}