public class Stock {
    public static void predictstock(int sp[]) {
        
        int bp=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        int maxprofit=0;
        for(int i=0;i<sp.length;i++){
        if(sp[i]>bp) {
            profit=sp[i]-bp;
            if(profit>maxprofit)
            maxprofit=profit;
        }
        else
            bp=sp[i];

    }
    System.out.print("Maxprofit is: " + maxprofit);
    }

    public static void main(String[] args) {
        
        int[] sp={7,1,5,3,6,4};
        predictstock(sp);
    }
}