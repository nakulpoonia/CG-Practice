package M1Test;


import java.util.*;
class Anagarm {
    public static void main(String[] args) {
        String s="abcd";
        String s1="dcabe";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            if(!map.containsKey(ch1)){
                System.out.print("No");
                return;
            }
            else{
                map.put(ch1,map.get(ch1)-1);

            }
            if(map.get(ch1)==0){
                map.remove(ch1);
            }

        }
        if(map.isEmpty()){
            System.out.print("Yes");
        }

    }
}
