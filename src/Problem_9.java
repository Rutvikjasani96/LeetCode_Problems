public class Problem_9 {
//    Palindrome Number
    public boolean isPalindrome(int x) {
        boolean bool = false;
        int rev = 0;
        int question = x;
        int reverse_Val = 0;
        if (question >= 0) {
            while (question != 0) {
                rev = question % 10;
                System.out.println(rev);
                reverse_Val = (reverse_Val * 10) + rev;
                question = question / 10;
            }
            System.out.println(reverse_Val);
            if (reverse_Val == x) {
                bool = true;
            }
        } else {
            bool = false;
        }
        return bool;
    }
}
