import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            if (s.equals(""))
                return true;
            return false;
        }
        char[] chars = s.toCharArray();
        List<Character> openBrackets = Arrays.asList('{','(','[');
        Stack<Character> parantheses = new Stack<>();
        for (char c: chars) {
            if (openBrackets.contains(c)) {
                parantheses.push(c);
            } else {
                if (parantheses.isEmpty())
                    return false;
                switch (c) {
                    case ']':
                        if (parantheses.pop() == '[')
                            break;
                        else return false;
                    case '}':
                        if (parantheses.pop() == '{')
                            break;
                        else return false;
                    case ')':
                        if (parantheses.pop() == '(')
                            break;
                        else return false;
                }
            }
        }
        return parantheses.isEmpty();
    }
}