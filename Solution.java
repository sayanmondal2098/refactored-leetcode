import java.math.BigInteger;
import java.util.*;


// solution idea I : Check the last digit , if its 9 , then increase the new array size by one , other wise copy and increase the last element by one
public class Solution
{
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
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        Solution gfg = new Solution();
        int [] cardPoints = {9,8,7,6,5,4,3,2,1,0}; int k = 18;
        System.out.println(gfg.isValidParenthesis("()[]{}([{}])"));
        
    }
}