package M1PracticeQuestion;

    class EmailVerification {

    public static int passwordCheck(String str){

        if(str.length() < 4)
            return 0;

        if(Character.isDigit(str.charAt(0)))
            return 0;

        boolean hasDigit = false;
        boolean hasUpper = false;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch == ' ' || ch == '/')
                return 0;

            if(Character.isDigit(ch))
                hasDigit = true;

            if(Character.isUpperCase(ch))
                hasUpper = true;
        }

        if(hasDigit && hasUpper)
            return 1;

        return 0;
    }

    public static void main(String[] args) {

        String str = "aA1b";
        System.out.println(passwordCheck(str));
    }
}
