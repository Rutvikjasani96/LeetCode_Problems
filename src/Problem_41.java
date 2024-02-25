public class Problem_41 {
//    First Missing Positive
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i< nums.length;i++){
            if(nums[i]<=0){
                nums[i] = nums.length+2;
            }
        }
        for(int i=0;i< nums.length;i++){
            int temp =nums[i];
            if(nums[i]<0){     //  for absolute value
                temp = -1 * nums[i];
            }
            if(temp<= nums.length && nums[temp-1]>0){
                nums[temp-1] = -1 * nums[temp-1];
            }
        }
        for(int i=0;i< nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
