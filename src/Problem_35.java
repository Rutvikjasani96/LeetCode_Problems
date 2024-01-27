public class Problem_35 {
//    Search Insert Position
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int target = 7;
        int k = searchInsert(array,target);
        System.out.println(k);
    }
    static int searchInsert(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(target<nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
