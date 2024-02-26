public class Problem_1704 {
//    Determine if String Halves Are Alike
    public static void main(String[] args) {
        String s = "booklelo";
        System.out.println("ans : "+halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        String str1 = s.substring(0,(s.length())/2);
        String str2 = s.substring(s.length()/2); // if we donot add end index it will s.length()
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);
        int hav1=0,hav2=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' || str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U'){
                hav1++;
            }
            if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u' || str2.charAt(i)=='A' || str2.charAt(i)=='E' || str2.charAt(i) == 'I' || str2.charAt(i) == 'O' || str2.charAt(i) == 'U'){
                hav2++;
            }
        }
        if(hav1 == hav2){
            return true;
        }
        return false;
    }
}
