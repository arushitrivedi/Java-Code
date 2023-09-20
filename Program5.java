//Valid Paetheses - Leetcode
class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<Character>();
        char ar[]=s.toCharArray();
        for(char ch:ar)
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else 
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char c=st.peek();
                if(((ch==')')&&(c=='('))||((ch=='}')&&(c=='{'))||((ch==']')&&(c=='[')))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }            
        }
        return st.isEmpty();
    }
}
