public class MergeSort {
    public static void mergesort(int[] arr, int si, int li) {
        if(si>=li){
            return;
        }
        int mid = si+(li-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,li);
        merge(arr,si,mid,li);

    }

    public  static void merge(int[] arr, int si, int mid, int li) {
        int[] temp =new int[li-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=li) {
            if(arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            } else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++]=arr[i++];
        }
        while(j<=li) {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++) {
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int[] arr ={6,3,9,5,2,8,-2};
        mergesort(arr,0,arr.length-1);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}