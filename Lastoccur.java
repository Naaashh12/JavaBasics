public class Lastoccur {
    public static int loccur(int[] a,int key,int i) {
        if(i==a.length)
        return -1;
        int ifFound = loccur(a,5,i+1);
        if(ifFound==-1 && key==a[i]) 
        return i;
        return ifFound;
    }

    public static void main(String[] args) {
        int[] a ={1,2,5,7,4,6,5,9};
        System.out.println(loccur(a,5,0));
    }
}