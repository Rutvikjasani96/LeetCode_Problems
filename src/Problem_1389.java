import java.util.*;
public class Problem_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = target.get(i);
        }
        return result;
    }
}
