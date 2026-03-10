package M1Test;

class Peak {
    public static void main(String[] args) {
        int[]a={1,2,3,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                System.out.print(a[i]);
                return;
            }
        }
    }
}
