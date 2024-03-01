public class Problem_2864 {
    //    Maximum odd Binary Number
    public String maximumOddBinaryNumber(String s) {
        int cntOne = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cntOne++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(cntOne>0){
                result.append('1');
                cntOne--;
            }else if(i==s.length()-1){
                result.append('1');
            }else{
                result.append('0');
            }
        }
        return result.toString();
    }
}
