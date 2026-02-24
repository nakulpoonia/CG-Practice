package MockTest.String;

public class PositionReverse {
    public static void main(String[] args) {
        String s = "I love India";
        StringBuilder sb = new StringBuilder();
        String[]arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                sb.append(arr[i].charAt(j));
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
