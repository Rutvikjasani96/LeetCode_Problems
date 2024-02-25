public class Problem_58 {
//    Length of Last Word
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean status = false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                status = true;
                length++;
            }
            if(status == true && s.charAt(i) == ' '){
                break;
            }
        }
        return length;
    }
}
