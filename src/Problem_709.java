public class Problem_709 {
//    To Lower Case
    public static void main(String[] args) {
        String s = "abcA";
        System.out.println(toLowerCase(s));
    }
    static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
                sb.setCharAt(i, (char) (sb.charAt(i) ^ 32));
            }
        }
        return sb.toString();
    }
}
