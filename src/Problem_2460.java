public class Problem_2460 {
//    Apply Operations to an Array
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        int[] ans = new int[nums.length];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[cnt] = nums[i];
                cnt++;
            }
        }
        return ans;
    }
}
