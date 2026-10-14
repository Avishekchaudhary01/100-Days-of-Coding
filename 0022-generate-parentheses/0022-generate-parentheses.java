class Solution {
    void fun(String s,int open ,int close,List<String>ans,int n){
        if (s.length() == 2*n){
            ans.add(s);
            return ;
        }
        if (open < n){
            fun(s +"(", open+1,close,ans,n);
        }
        if(open > close   ){
            fun(s +")", open ,close+1,ans,n);
        }
       
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        fun("", 0,0,ans,n);
        return ans;
        
    }
}