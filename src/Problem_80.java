public class Problem_80 {
//    Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        int i=2,j=2;
        while(i<nums.length){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
