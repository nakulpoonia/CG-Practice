package MockTest.Array;

public class RotationPalindrome {

    static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean anyRotationPalindrome(String s) {
        int n = s.length();
        String doubled = s + s;

        for (int i = 0; i < n; i++) {
            if (isPalindrome(doubled, i, i + n - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(anyRotationPalindrome(s));
    }
}
