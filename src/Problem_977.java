import java.util.Arrays;

public class Problem_977 {
//    Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }}
