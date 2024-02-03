import java.util.*;

public class Problem_15 {
//    3 Sum
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> final_ans = threesum(nums);
        System.out.println("final ans : "+final_ans);
    }

    static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);   // sort the array
        Set<List<Integer>> uniqueList = new HashSet<>();   // hashset haves a unique keys not added same keys
        List<List<Integer>> final_ans = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){   // we are changing the value if sum is 0
                    uniqueList.add(Arrays.asList(nums[i] , nums[j] , nums[k])); // we are using Hasset to avoid repeat arrays
                    j++;
                    k--;
                }else if(sum<0){
                    j++; // we go to the larger value if sum is less than 0
                }else{  // sum>0
                    k--;   // we go to the smaller value if sum is more than 0
                }
            }
        }
        final_ans.addAll(uniqueList);   // Add all the Lists of sum 0 in final_ans List
        return final_ans;
    }

//    ↓↓↓↓ This Approach is having O(n^3) time Complexity. →→→ LeetCode not valid the code of ↓↓↓
//    static List<List<Integer>> threeSumWithMoreTime(int[] nums){
//        Arrays.sort(nums);
//        Set<List<Integer>> uniqueList = new HashSet<>();   // hashset haves a unique keys not added same keys
//        List<List<Integer>> final_ans = new ArrayList<>();
//        for(int i=0;i< nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                for(int k = j+1;k< nums.length;k++){
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        uniqueList.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        final_ans.clear();
//        final_ans.addAll(uniqueList);
//        return final_ans;
//    }
}
