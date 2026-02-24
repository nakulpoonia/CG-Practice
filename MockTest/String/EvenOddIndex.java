package MockTest.String;

public class EvenOddIndex {
    public static void main(String[] args) {
        String s ="java programming";
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt=0;
                sb.append(' ');
                continue;
            }
            if(cnt%2==0){
                if(s.charAt(i)>=97) sb.append((char)(s.charAt(i)-32));
                else{
                    sb.append(s.charAt(i));
                }
            }else{
                if(s.charAt(i)<97){
                sb.append((char)(s.charAt(i)+32));
            }else{
                    sb.append(s.charAt(i));
                }


            }
            cnt++;
        }
        System.out.println(sb);
    }
}
