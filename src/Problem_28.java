public class Problem_28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println("ans : "+strStrOptimized(haystack,needle));
        System.out.println("ans : "+strStr(haystack,needle));
    }
    static int strStrOptimized(String haystack, String needle){
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int s = i;
                int cnt=0;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(s)==needle.charAt(j)){
                        cnt++;
                        s++;
                    }else{
                        break;
                    }
                }
                if(cnt==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
