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
        }
   
    
    
     */
    
}
