public class Problem_169 {
//    Majority Element
    public int majorityElement(int[] nums) {
        int ele;
        int freq=1;
        ele = nums[0];
        for(int i=1;i<nums.length;i++){
            if(freq==0){
                ele = nums[i];
                freq++;
            }else if(ele == nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ele;
    }
}
