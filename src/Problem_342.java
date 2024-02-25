public class Problem_342 {
//    Power of Four
    public boolean isPowerOfFour(int n) {
        int cnt = 0;
        int bitno=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                cnt++;
                bitno = i;
            }
        }
        return bitno % 2 == 0 && cnt==1 ? true : false;
    }
}
