package M1Test;


import java.util.*;
class FirstOccurence {
    public static void main(String[] args) {
        int[]a={1,1,1,2,2,2,3,3,1};
        HashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        int[]arr=new int[set.size()];
        int index=0;
        for(int x : set){
            arr[index] = x;
            index++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }




    }
}
