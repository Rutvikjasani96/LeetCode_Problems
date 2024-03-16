import java.util.HashMap;

public class Problem_525 {
//    Contiguous Array
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(sum==0){
                ans = i+1;
            }else if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }else{
                ans = Math.max(ans,i-hm.get(sum));
            }
        }
        return ans;
    }
}
