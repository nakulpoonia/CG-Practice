package M1PracticeQuestion;
import java.util.*;
class Solution67{
    public static int index(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char expected=s.charAt(i);
            int exceptedCount=expected-'0';
            char toCheck=(char)(i+'0');
            int actualCount=map.getOrDefault(toCheck,0);
            if(actualCount!=exceptedCount){
                return 0;
            }
            else{
                set.add(expected);
            }

        }
        return set.size();





    }
}

public class AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Solution67.index(s));
    }

}
