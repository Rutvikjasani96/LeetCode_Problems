public class Problem_560 {
//    Subarray Sum Equals K
    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length];
        int cnt=0;
        ps[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i] = ps[i-1] + nums[i];
        }
        for(int i=ps.length-1;i>=0;i--){
            if(ps[i]==k){
                cnt++;
            }
            for(int j=i-1;j>=0;j--){
                if(ps[i]-ps[j]==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
