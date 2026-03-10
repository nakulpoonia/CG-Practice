package M1Test;


import java.util.*;
class ThreeCharactertoRight {
    public static void main(String[] args) {
        String s="nrfzh";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(ch=='x'){
                sb.append('a');
            }
            if(ch=='y'){
                sb.append('b');
            }
            if(ch=='z'){
                sb.append('c');
            }
            else{
                char ch1=(char)(ch+3);
                sb.append(ch1);
            }

        }
        System.out.print(sb);




    }
}
