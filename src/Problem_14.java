public class Problem_14 {
//    Longest Common Prefix
    public static void main(String[] args) {
        String[] strs = {" "};
        String ans = longestCommonPrefix(strs);
        System.out.println("ans : "+ans);
    }
    static String longestCommonPrefix(String[] strs){
        if(strs.length == 1){
            return strs[0];
        }
        if(strs.length == 0){
            return "";
        }
        int cnt_min=Integer.MAX_VALUE;
        for(int i=1;i<strs.length;i++){
            String s1 = strs[i-1];
            String s2 = strs[i];
            int j=0;
            int cnt=0;
            while(j < s1.length() && j < s2.length()){
                if(s1.charAt(j) == s2.charAt(j)){
                    cnt++;
                    j++;
                }else{
                    break;
                }
            }
            if(cnt_min>cnt){
                cnt_min = cnt;
            }
        }
        return cnt_min > 0 ? strs[1].substring(0,cnt_min) : "";
    }
}
