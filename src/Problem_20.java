import java.util.Stack;

public class Problem_20 {
//    Valid Parentheses
    public static void main(String[] args) {
        String s ="(}";
        boolean ans = isValid(s);
        System.out.println("ans : "+ans);
    }
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int c : s.toCharArray()){
           if(c == '('){
               st.push(')');
           } else if (c == '[') {
               st.push(']');
           } else if (c == '{') {
               st.push('}');
           } else if (st.isEmpty() || st.pop() != c) {
               return false;
           }
        }
        return st.isEmpty();
    }
}
