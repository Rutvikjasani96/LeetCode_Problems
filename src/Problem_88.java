import java.util.Arrays;

public class Problem_88 {
//    Merge Sorted Array
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1,m,nums2,n);
        for (int j : nums1) {
            System.out.print(" " + j);
        }
    }
    static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i=0;i< nums2.length;i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
//    static void merge(int[] nums1, int m, int[] nums2, int n){
//        int ind = 0;
//        if(n!=0) {
//            for (int i = 0; i < nums1.length; i++) {
//                if (nums2[ind] <= nums1[i]) {
//                    for (int j = nums1.length - 1; j > i; j--) {
//                        nums1[j] = nums1[j - 1];
//                    }
//                    nums1[i] = nums2[ind];
//                    if(ind<n-1) {
//                        ind++;
//                    }
//                }
//            }
//            for (int i = m + ind; i < nums1.length; i++) {
//                nums1[i] = nums2[ind];
//                if(ind<n-1) {
//                    ind++;
//                }
//            }
//        }
//        for(int i=0;i< nums1.length;i++){
//            System.out.print(" "+nums1[i]);
//        }
//        System.out.println();
//    }
}
