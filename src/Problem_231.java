public class Problem_231 {
//    Power of Two
    public static void main(String[] args) {
        int n = 0;
        boolean ans = isPowerOfTwo(n);
        System.out.println("ans : "+ans);
    }
    static boolean isPowerOfTwo(int n){
        if((n & (n-1))== 0 && n>0){
            return true;
        }
        return false;
    }
}
