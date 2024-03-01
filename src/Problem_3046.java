import java.util.HashMap;

public class Problem_3046 {
//    Split the Array
    public static void main(String[] args) {
        int[] nums = {6,1,3,1,1,8,9,2};
        System.out.println("ans : "+isPossibleToSplit(nums));
    }
    static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] + " : " + hm.get(nums[i]));
        }
        for(int i=0;i<nums.length;i++){
            if((hm.get(nums[i]))>2){
                return false;
            }
        }
        return true;
    }
    public boolean isPossibleToSplitOptimized(int[] nums) {
        int[] cnt = new int[101];
        for(int i=0;i<nums.length;i++){
            cnt[nums[i]-1]++;
            if(cnt[nums[i]-1]>2){
                return false;
            }
        }
        return true;
    }
}
