public class Problem_713 {
//    Subarray Product Less Than K
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0,prod=1;
        int i=0,j=0;
        while(j<nums.length){
            prod *= nums[j];
            while(prod>=k && i<=j){
                prod /= nums[i];
                i++;
            }
            ans += j-i+1;
            j++;
        }
        return ans;
    }
}
