public class Problem_367 {
//    Valid Perfect Square
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        long left = 2;
        long right = num/2;
        while(left<=right){
            long mid = (left + right) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid < num){
                left = mid+1;
            }else if(mid * mid > num){
                right = mid-1;
            }
        }
        return false;
    }
}
