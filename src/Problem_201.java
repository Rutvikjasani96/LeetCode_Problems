public class Problem_201 {
//    Bitwise AND of Numbers Range
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println("range bitwise And : "+rangeBitwiseAnd(left,right));
    }
    static int rangeBitwiseAnd(int left, int right) {
        while(right > left) {
            right = right & right - 1;
        }
        return right;
    }
}
