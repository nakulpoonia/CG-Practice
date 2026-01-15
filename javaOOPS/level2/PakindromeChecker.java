package javaOOPS.level2;

public class PakindromeChecker {
    String str;

    PakindromeChecker(String str){
        this.str=str;
    }

    boolean isPalindrome(){
        StringBuilder result = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            result.append(str.charAt(i));


        }
        return str.equals(result.toString());

    }
    void display(){
        System.out.print(isPalindrome());
    }

    public static void main(String[] args) {
        PakindromeChecker c = new PakindromeChecker("nakul");
        c.display();
    }

}
