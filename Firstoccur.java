public class Firstoccur {
    public static int foccur(int[] a,int key,int i) {
        if(i==a.length)
        return -1;
        if(key==a[i]) 
        return i;
        return foccur(a,5,i+1);

    }

    public static void main(String[] args) {
        int[] a ={1,2,5,7,4,6,9};
        System.out.println(foccur(a,5,0));
    }
}