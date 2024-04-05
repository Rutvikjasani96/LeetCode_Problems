public class Problem_1614 {
//    Maximum Nesting Depth of the Parentheses
    public int maxDepth(String s) {
        int cnt=0;
        int max_cnt=0;
        for(char c : s.toCharArray()){
            if(c == '('){
                cnt++;
            }
            if(cnt>max_cnt){
                max_cnt=cnt;
            }
            if(c == ')'){
                cnt--;
            }
        }
        return max_cnt;
    }
}
