public class Problem_930 {
//    Binary Subarrays With Sum
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum==goal){
                    ans++;
                }
            }
        }
        return ans;
    }
}
