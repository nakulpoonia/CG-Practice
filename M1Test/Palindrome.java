package M1Test;


import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        String s="madam level my name ";
        String[]a=s.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++){
            StringBuilder rev=new StringBuilder();
            for(int j=a[i].length()-1;j>=0;j--){
                char ch=a[i].charAt(j);
                rev.append(ch);
            }
            if(rev.toString().equals(a[i])){
                count++;
            }

        }
        System.out.print(count);

    }
}
