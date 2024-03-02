import java.util.*;

public class Problem_2215 {
//    Find the Difference of Two Arrays
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(hs2.contains(nums1[i])){
                hs2.remove(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(hs1.contains(nums2[i])){
                hs1.remove(nums2[i]);
            }
        }
        List<Integer> l1 = new ArrayList<>(hs1);
        List<Integer> l2 = new ArrayList<>(hs2);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
