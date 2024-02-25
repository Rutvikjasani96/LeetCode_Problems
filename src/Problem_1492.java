public class Problem_1492 {
//    The Kth Factor of n
    public int kthFactor(int n, int k) {
        int cnt = 0,ans = -1;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt==k){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
