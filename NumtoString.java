public class NumtoString {
    public static int convert(int[] num,int i) {
        if(i==num.length) {
            System.out.print(" ");
            return -1;
        }
    String[] map={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    int currentnum=num[i];
    
    System.out.print(map[currentnum]+" ");
    return convert(num,i+1);
    }
    public static void main(String[] args) {
        int[] num={2,0,1,9};
        convert(num,0);
        }
}