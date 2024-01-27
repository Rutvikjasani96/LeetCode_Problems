import java.util.ArrayList;

public class Problem_27 {
//    Remove Element
    public static void main(String[] args) {
        int[] array = {3,2,2,3};
        int val = 3;
        int k = removeElement(array,val);
        System.out.println("\n"+k);
    }
    static int removeElement(int[] nums, int val){
        ArrayList<Integer> nums_new = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums_new.add(nums[i]);
            }
        }
        for(int i=0;i<nums_new.size();i++){
            nums[i] = nums_new.get(i);
        }
        for(int i=nums_new.size();i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return nums_new.size();
    }
}
