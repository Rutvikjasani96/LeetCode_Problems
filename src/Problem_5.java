public class Problem_5 {
//    Longest Palindromic Substring
    public static void main(String[] args) {
//        String s = "abacd";
//        String s = "cdaba";
//        String s = "abcba";
//        String s = "abcdef";
//        String s = "";
//        String s = "a";
//        String s = "abbc";
//        String s = "bbac";
        String s = "acbb";
        String ans = longestPalindrome(s);
        System.out.println("ans : "+ans);
    }
    static String longestPalindrome(String s){
        int ans = 0;
        StringBuilder ans_str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int j = i-1;
            int k = i+1;
            while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
                    j--;
                    k++;
            }
            if(ans<k-j+1){
                ans = k-j+1;
                ans_str = new StringBuilder();
                for(int l=j+1;l<k;l++){
                   ans_str.append(s.charAt(l));
                }
            }
        }
        for(int i=0;i<s.length();i++){
            int j = i-1;
            int k = i;
            while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
                    j--;
                    k++;
            }
            if(ans<k-j+1){
                ans = k-j+1;
                ans_str = new StringBuilder();
                for(int l=j+1;l<k;l++){
                   ans_str.append(s.charAt(l));
                }
            }
        }
        return String.valueOf(ans_str);
    }
}
