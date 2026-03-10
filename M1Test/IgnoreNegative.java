package M1Test;


import java.util.*;
class IgnoreNegative {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        int[]a={1,-2,3,-4,5,6};
        for(int x:a){
            if(x>=1){
                list.add(x);
            }
        }
        int low=0;
        int high=list.size()-1;
        int mid=low+(high-low)/2;
        System.out.print(list.get(mid));







    }
}
