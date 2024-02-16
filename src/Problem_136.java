public class Problem_136 {
//    Single Number
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2};
        System.out.println("ans : "+singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
