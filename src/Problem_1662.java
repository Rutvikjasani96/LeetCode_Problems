public class Problem_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(int i=0;i<word1.length;i++){
            str1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            str2+=word2[i];
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}