public class Problem_190 {
//    Reverse Bits
//    Link : https://youtu.be/LJiMk8lPJNc?si=_l8nl1J0XPmn1qpj
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int lsb = 0;
            if(((n>>i)&1)==1){
                lsb = 1<<31-i;
                ans = ans | lsb;
            }
        }
        return ans;
    }
}
