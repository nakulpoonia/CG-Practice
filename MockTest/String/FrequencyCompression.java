package MockTest.String;
import java.util.*;
import java.util.HashMap;

public class FrequencyCompression {
    public static void main(String[] args) {
        String s ="aaabbcdd";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() +""+ entry.getValue());
        }
    }
}
