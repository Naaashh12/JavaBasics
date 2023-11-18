public class Twosum {

    public static int[] addTwonums(int[] a1, int[] a2) {
        int[] ans = new int[8];
        int sum=a1[0]+a2[0];
        ans[0]=sum%10;
        int prev=0;
        for(int i=1;i<7;i++) {
            prev = sum/10;
            sum = a1[i]+a2[i]+prev;
            ans[i]=sum%10;
            
        }
        if (prev > 0) {
            ans[7] = prev;
        }

        for(int i=0;i<8;i++) {
            System.out.print(ans[i]+",");
        }
        return ans;
    }
    public static void main(String[] args) {
        int a1[] = new int[] {9,9,9,9,9,9,9};
        int a2[] = new int []{9,9,9,19,0,0,0};
        addTwonums(a1,a2);

    }
    
}
