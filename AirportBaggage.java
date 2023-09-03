public class AirportBaggage {
    public static void countbags(int slots,int bags) {
        int[] storage = new int [slots];
        int i=0;
        int k=1;
        int count =0;
        int totalbags=bags;
        while(slots > 0 && bags > 0 && count<=totalbags ) {
        
            storage[i]=k;
            count+=storage[i];
            i++;k++;
            bags--;slots--;
        }
        for(int j=0;j<storage.length;j++) {
            System.out.print(storage[j]+" ");
        }
    }
    public static void main(String[] args) {
        int bags=20;
        int slots=8;
        countbags(slots,bags);

    }
}