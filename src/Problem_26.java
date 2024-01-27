import java.util.*;
import java.util.Arrays;

public class Problem_26 {
//    Remove Duplicates From Sorted Array
    public static void main(String[] args) {
        int[] array = {1,1,2};
        int k = removeDuplicates(array);
        System.out.println(k);
    }
    public static int removeDuplicates(int[] nums){
        ArrayList<Integer> nums_new = new ArrayList<>();
        nums_new.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums_new.add(nums[i]);
            }
        }
        for(int i=0;i<nums_new.size();i++){
            nums[i]= nums_new.get(i);
        }
        for(int i=nums_new.size();i<nums.length;i++){
            nums[i]=0;
        }
        return nums_new.size();
    }
}
