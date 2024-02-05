public class Problem_258 {
//    Add Digits
    public static void main(String[] args) {
        int num = -38;
        int ans = addDigits(num);
        System.out.println("ans : "+ans);
    }
    static int addDigits(int num){
        int sum = 0;
        while(num>0){
            int rev = num%10;
            sum = sum + rev;
            num = num/10;
        }
        if(sum > 9){
           return addDigits(sum);
        }
        return sum;
    }
}
