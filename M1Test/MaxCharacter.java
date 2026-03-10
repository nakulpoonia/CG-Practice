package M1Test;



class MaxCharacter {
    public static void main(String[] args) {
        String s="abcaaddddd";
        int count=0;
        int max=0;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;

                }
                if(count>max){
                    ch=s.charAt(i);
                    count=max;
                }


            }
        }
        System.out.print(ch);
    }
}
