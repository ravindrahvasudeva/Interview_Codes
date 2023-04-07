public class ValidParanthesis {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (char n : s.toCharArray()) {
                if (n == '(' || n == '[' || n == '{')
                    stack.push(n);
                else {
                    if(stack.isEmpty()) return false;
                    char ch = stack.pop(); 
                    if((n == ')' && ch == '(') ||  (n == ']' && ch == '[') || (n == '}' && ch == '{')) continue;
                    else return false;
                }
            }
            return stack.isEmpty();
        }}
    /*
    ------------------ Valid Parentheses--------------------------
    
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.Open brackets must be closed in the correct order.Every close bracket has a corresponding open bracket of the same type.
       
    
    Example 1:
    Input: s = "()"
    Output: true
    
    Example 2:
    Input: s = "()[]{}"
    Output: true
    
    Example 3:
    Input: s = "(]"
    Output: false
    
    
     */
    
