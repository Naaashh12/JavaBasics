public class Findoccurances {
    public static int find(int[] arr, int key,int i) {
        if(i==arr.length) {
            return -1;
        }
        if(arr[i]==key) 
        System.out.println(i);

        return find(arr, key, i+1);
        

    }
    public static void main(String[] args) {
        int[] a={3,2,4,5,6,2,7,2,2};
        System.out.print(find(a,2,0));
    }
}