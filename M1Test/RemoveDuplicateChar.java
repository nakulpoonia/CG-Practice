package M1Test;


import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="CsharpstarZ";
        HashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
        }
        for(char x:set){
            System.out.print(x);
        }


    }
}
