package MockTest.String;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        int max=0;
        int maxlen=0;

        String s="abcabcbb";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i,j);

                HashSet<Character>set= new HashSet<>();

                for(int x=0;x<s1.length();x++){
                    set.add(s1.charAt(x));

                }
                if(s1.length()== set.size()){
                    max=s1.length();
                }
                maxlen=Math.max(maxlen,max);
            }
        }
        System.out.println(maxlen);

    }
}
