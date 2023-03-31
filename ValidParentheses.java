import java.util.*;

public class ValidParentheses {


    public boolean solution(String s) {
        Stack<Character> ls = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') ls.add(c[i]);
            else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
                if (ls.isEmpty()) return false;
                else if ((ls.peek() == '(' && c[i] == ')') ||
                        (ls.peek() == '{' && c[i] == '}') ||
                        (ls.peek() == '[' && c[i] == ']')) {
                    ls.pop();
                }else return false;
            }
        }if (ls.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();
        System.out.println(test.solution("[{}]"));
    }




}
