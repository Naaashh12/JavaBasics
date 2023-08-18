public class Triplets {
    public static void triples(int a[]) {
        int sum;
        int n=a.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=+1;k<n;k++) {
                    if((i!=j&&j!=k&&k!=i)&&(a[i]+a[j]+a[k]==0))
                    System.out.println(a[i]+","+a[j]+","+a[k]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a ={-1, 0,  1, 2, -1, -4};
        triples(a);
    }
}