package M1Test;


import java.util.*;
class ToUpperLower {
    public static void main(String[] args) {
        String s="nAkUlpOoniA";
        int lc=0;
        int hc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97){
                lc++;
            }
            else if(s.charAt(i)<97){
                hc++;
            }
        }
        String a="";
        if(lc>hc){
            a=s.toLowerCase();
        }
        else{
            a=s.toUpperCase();
        }
        System.out.print(a);







    }
}
