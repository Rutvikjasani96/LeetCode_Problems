public class Problem_1859 {
//    Sorting the Sentence
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println("ans : "+sortSentence(s));
    }
    static String sortSentence(String s) {
        int spaceCount = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spaceCount++;
            }
        }
        String[] strArr = new String[spaceCount];
        int space=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                space = i;
            }
            for(int j=1;j<10;j++){
                if(s.charAt(i)==(j+'0')){
                    strArr[j-1] = s.substring(space+1,i);
                }
            }
        }
        String ans = "";
        for(int i=0;i<strArr.length;i++){
            if(i>0){
                ans = ans + ' ';
            }
            ans+=strArr[i];
        }
        return ans;
    }
}
