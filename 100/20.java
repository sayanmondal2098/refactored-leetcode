import java.util.Stack;

class P20 {
    public boolean isValidParenthesis(String s) {
        Stack<Character> charactersStack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charactersStack.push(c);
            } else if(c == ')' && !charactersStack.isEmpty() && charactersStack.peek()=='('){
                charactersStack.pop();
            } else if(c == '}' && !charactersStack.isEmpty() && charactersStack.peek()=='{'){
                charactersStack.pop();
            } else if(c == ']' && !charactersStack.isEmpty() && charactersStack.peek()=='['){
                charactersStack.pop();
            } else {
                return false;
            }
        }

        return charactersStack.isEmpty();
    }
}
