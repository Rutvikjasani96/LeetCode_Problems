public class Problem_3084 {
//    Count Substrings Starting and Ending with Given Character
    public long countSubstrings(String s, char c) {
        long c_count = 0,ans = 0;;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
                c_count++;
                ans = ans + c_count;
            }
        }
        return ans;
    }
}
