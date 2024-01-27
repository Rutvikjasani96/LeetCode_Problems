public class Problem_66 {
//    Plus One
    public static void main(String[] args){
        int[] digits = {1,2,3,9,9};
        int[] solution = plusOne(digits);
        for (int i : solution) {
            System.out.println(i);
        }
    }
    static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if(i!=0) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    break;
                }
            }
            else{
                if(digits[i]==9){
                    digits = new int[digits.length+1];
                    for(int j= digits.length-1;j>0;j--){
                        digits[j] = digits[j-1];
                    }
                    digits[0]=1;
                }else{
                    digits[i] += 1;
                }
            }
        }
        return digits;
    }
}
