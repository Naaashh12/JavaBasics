public class Pairsarray {
    public static void main (String[] args) {
        int[] arr ={10,20,30,40,50};
        
        printpairs(arr);
    }
    public static void printpairs(int num[]) {
        for (int i=0;i<num.length;i++) {
            for(int j=i+1;j<num.length;j++) {
                System.out.println("{"+num[i]+","+num[j]+"}");
            }
            System.out.println();
        }
        System.out.println();

    }
}