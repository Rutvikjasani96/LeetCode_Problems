import java.util.*;

public class Problem_16 {
//    3 Sum Closest
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target =1;
        int closest_sum = threeSumClosest(nums,target);
        System.out.println("closest sum : "+closest_sum);
    }
    static int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int closest_sum =  0;
        List<Integer> all_sum = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    all_sum.add(sum);
                    j++;
                    k--;
                }else if(sum<target){
                    all_sum.add(sum);
                    j++;
                }else {
                    all_sum.add(sum);
                    k--;
                }
            }
        }
        int ans_min=Integer.MAX_VALUE;
        for(int i = 0; i< all_sum.size(); i++){
            int comp;
            if(target> all_sum.get(i)){
                comp = target - all_sum.get(i);
            }else{
                comp = all_sum.get(i) - target;
            }
            if(ans_min>comp){
                ans_min = comp;
                closest_sum = all_sum.get(i);
            }
        }
        return closest_sum;
    }
}
