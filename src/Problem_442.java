import java.util.ArrayList;
import java.util.List;

public class Problem_442 {
//    Find All Duplicates in an Array
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(temp<0){
                temp*=-1;
            }
            if(nums[temp-1]<0){
                ans.add(temp);
            }
            nums[temp-1]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]*=-1;
            }
        }
        return ans;
    }
}
