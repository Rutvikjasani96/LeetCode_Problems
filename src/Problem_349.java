
import java.util.HashSet;
import java.util.Objects;

public class Problem_349 {
//    Intersection of two Arrays
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    hs.add(nums1[i]);
                }
            }
        }
        int[] ans = new int[hs.size()];
        Object[] temp = hs.toArray();
        for(int i=0;i< temp.length;i++){
            ans[i] = (int) temp[i];
        }
        return ans;
    }
}
