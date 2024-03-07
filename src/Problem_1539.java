import java.util.HashSet;

public class Problem_1539 {
//    Kth Missing Positive Number
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=1;k>=0;i++){
            if(!hs.contains(i)){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return 0;
    }
}
