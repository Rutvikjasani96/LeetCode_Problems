public class Problem_2138 {
//    Divide a String Into Groups of Size k
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] ans =divideStringOptimized(s,k,fill);
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
    static String[] divideString(String s, int k, char fill) {
        String[] ans = new String[(s.length()+k-1)/k];
        int i=0;
        int j=k-1;
        int cnt=0;
        while(j<s.length() && j-i+1==k){
            StringBuilder sb = new StringBuilder();
            for(int l=i;l<=j;l++){
                sb.append(s.charAt(l));
            }
            ans[cnt] = sb.toString();
            i+=k;
            j+=k;
            cnt++;
        }
        System.out.println(ans.length);
        System.out.println(cnt);
        if(i<s.length()){
            StringBuilder sb = new StringBuilder();
            for(int l=0;l<k;l++){
                if(i<s.length()){
                    sb.append(s.charAt(i));
                    i++;
                }else{
                    sb.append(fill);
                }
            }
            ans[cnt] = sb.toString();
        }
        return ans;
    }
    static String[] divideStringOptimized(String s, int k, char fill) {
        if(s.length() == k){
            return new String[] {s};
        }
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()%k!=0){
            sb.append(fill);
        }
        String[] ans = new String[sb.length()/k];
        int i=0;
        int j= k-1;
        int cnt=0;
        while(j<sb.length()){
            ans[cnt] = sb.substring(i,j+1);
            i+=k;
            j+=k;
            cnt++;
        }
        return ans;
    }
}
