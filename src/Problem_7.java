public class Problem_7 {
//    Reverse Integer
    public static void main(String[] args) {
//        int  x = 123;
        int  x = 1534236469;
        int ans = reverse(x);
        System.out.println("ans : "+ans);
    }
    static int reverse(int x){
        int ans = 0;
        while(x!=0){
            int last_digit = x % 10;
            if(ans < Integer.MIN_VALUE/10 || ans > Integer.MAX_VALUE/10 ) {
                return 0;
            }
            ans = (ans * 10) + last_digit;
            x=x/10;
        }
        return ans;
    }
}
