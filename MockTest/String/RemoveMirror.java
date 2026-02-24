package MockTest.String;

public class RemoveMirror {
    public static void main(String[] args) {
        String s = "abcabc";

        if (s.length() % 2 != 0) {
            System.out.println("Not mirror Image");
            return;
        }

        int n = s.length() / 2;

        String s1 = s.substring(0, n);
        String s2 = s.substring(n);

        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();

        if (s1.equals(sb.toString())) {
            System.out.println("Mirror Image");
        } else {
            System.out.println("Not mirror Image");
        }
    }
}