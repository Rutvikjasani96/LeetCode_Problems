public class Problem_12 {
//    Integer to Roman
    public static void main(String[] args) {
        int num = 50;
        String roman = intToRoman(num);
        System.out.println("int ans : "+roman);
    }
    static String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            if(num < 4){
                sb.append("I");
                num = num - 1;
            }else if(num == 4){
                sb.append("IV");
                break;
            }else if (num < 9){
                sb.append("V");
                num = num - 5;
            }else if(num == 9){
                sb.append("IX");
                break;
            } else if (num < 40) {
                sb.append("X");
                num = num - 10;
            } else if(num == 40){
                sb.append("XL");
                break;
            } else if (num < 50) {
                sb.append("XL");
                num = num - 40;
            } else if (num < 90) {
                sb.append("L");
                num = num - 50;
            } else if (num == 90) {
                sb.append("XC");
                break;
            } else if (num < 100) {
                sb.append("XC");
                num = num - 90;
            } else if (num < 400) {
                sb.append("C");
                num = num - 100;
            } else if (num == 400) {
                sb.append("CD");
                break;
            }else if (num < 500){
                sb.append("CD");
                num = num - 400;
            }else if (num < 900) {
                sb.append("D");
                num = num - 500;
            } else if (num == 900) {
                sb.append("CM");
                break;
            } else if (num < 1000) {
                sb.append("CM");
                num = num - 900;
            } else {
                sb.append("M");
                num = num - 1000;
            }
        }
        return sb.toString();
    }
}
