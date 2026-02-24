package MockTest.String;

public class Merge {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1 ="abcdef";
        String s2="XYZ";
        int a=0;
        int b=0;
        while(a<s1.length() && b<s2.length()){
            sb.append(s1.charAt(a));
            sb.append(s2.charAt(b));
            a++;
            b++;
        }
        while(a<s1.length()){
            sb.append(s1.charAt(a));
            a++;
        }
        while(b<s2.length()){
            sb.append(s2.charAt(b));
            b++;
        }
        System.out.println(sb);

    }
}
