class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return false;
                } 
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }
            if(c == '}') {
                if(stack.empty() || stack.peek() != '{') {
                    return false;
                } 
                if(stack.peek() == '{') {
                    stack.pop();
                }

            }
            if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return false;
                } 
                if(stack.peek() == '[') {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
