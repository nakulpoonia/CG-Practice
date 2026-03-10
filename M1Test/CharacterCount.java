
package M1Test;
class CharacterCount {
    public static void main(String[] args) {
        String s="1011011101111";

        int index=0;
        for(int i=index;i<s.length();i++){
            int count=0;
            while(i<s.length()&&s.charAt(i)!='0'){
                count++;
                i++;

            }

            index=i;
            char ch=(char)(count+64);
            System.out.print(ch);

        }
    }
}
