public class MergeStringSort {
    public static void mergesort(String[] s,int si, int ei) {
        if(si>=ei) {
            return ;
        }
        int mid = si+(ei-si)/2;
        mergesort(s,si,mid);
        mergesort(s,mid+1,ei);
        merge(s,mid,si,ei);
        
    }
    public static void merge(String[] s,int mid,int si, int ei) {
        String[] temp=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei ) {
            if(s[i].compareTo(s[j])<0) {
              temp[k]=s[i];  
              i++;
            }
            else {
                temp[k]=s[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++]=s[i];
            i++;
        }
        while(j<=ei) {
            temp[k++]=s[j];
            j++;
        }
        for(k=0,i=si;k<temp.length;k++,i++) {
            s[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        String[]  str = {"sun","earth","mars","mercury"};
        mergesort(str,0,str.length-1);
        for(int i=0;i<str.length;i++) {
            System.out.print(" "+str[i]);
        }
    } 
}