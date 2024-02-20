public class Problem_268 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        System.out.println("missing number : "+missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        boolean isZero = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                isZero = true;
                nums[i] = nums.length + 2;
            }
        }
        if(!isZero){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(temp<0){
                temp = -1 * temp;
            }
            if(temp<nums.length && temp>0){
                nums[temp-1] = -1 * nums[temp-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length;
    }
}
