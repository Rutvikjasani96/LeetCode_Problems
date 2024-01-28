public class Problem_67 {
//    Add Binary
    public static void main(String[] args) {
        String a = "10";
        String b = "11";
        String ans = addBinary(a,b);
        System.out.println("Ans : "+ans);
    }
    static String addBinary(String a,String b){
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0'; // 0's ascii is 48.
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
            System.out.println("i : "+i);
            System.out.println("j : "+j);
            System.out.println("sum : "+sum);
            i--;
            j--;
        }
        if(carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }


//    static String trying(String a, String b){
//        if(a.length()==1 && a.charAt(0) == '0' && b.length()==1 && b.charAt(0) == '0'){
//            return "0";
//        }
//        int dec_a = 0;
//        int dec_b = 0;
//        int dec_c = 0;
//        for(int i=0;i<a.length();i++){
//            char tmp_char = a.charAt(i);
//            int tmp = Integer.parseInt(String.valueOf(tmp_char));
//            if(tmp==1) {
//                dec_a = dec_a + (1 << a.length()-i-1);
//            }
//        }
//        for(int i=0;i<b.length();i++){
//            char tmp_char = b.charAt(i);
//            int tmp = Integer.parseInt(String.valueOf(tmp_char));
//            if(tmp==1) {
//                dec_b = dec_b + (1 << b.length()-i-1);
//            }
//        }
//        dec_c = dec_a + dec_b;
//        String bin_c = "";
//        for(;dec_c>0;){
//            if(dec_c % 2 ==0) {
//                bin_c = bin_c + 0;
//            }else{
//                bin_c = bin_c + 1;
//            }
//            dec_c = dec_c / 2;
//        }
//        String rev_bin_c = "";
//        for(int i=bin_c.length()-1;i>=0;i--){
//            rev_bin_c = rev_bin_c + bin_c.charAt(i);
//        }
//        return rev_bin_c;
//    }
}
