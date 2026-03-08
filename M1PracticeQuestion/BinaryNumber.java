package M1PracticeQuestion;
import java.util.Stack;


public class BinaryNumber {
    public static void main(String[] args) {
        String s =  "1C0C1C1A0B1";
       char n= call(s);
       System.out.println(n);
    }

    public static char call(String s){
        Stack<Character>st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            st.push(s.charAt(i));
        }

        while(st.size()!=1){
            char a=st.pop();
            char b=st.pop();
            char c=st.pop();
            int aa = a-'0';
            int cc = c-'0';
            int res=0;
            if(b=='A'){
                res= aa & cc;
            }
            else if(b=='B'){
                res = aa |cc;
            }
            else{
                res = aa ^ cc;
            }
            st.push((char)(res+'0'));
        }
        return st.pop();
    }
}
