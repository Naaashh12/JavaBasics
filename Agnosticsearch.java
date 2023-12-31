public class Agnosticsearch {

    public static int agnosticsearch(int[] a,int key) {
        int low=0;
        int high = a.length-1;
        
            while(low<=high) {
                int mid= low+(high-low)/2;
                if(key==a[mid]) {
                    return mid;
                } 

                if(a[0]<a[1]) {
                    if(key<=a[mid]) {
                        high=mid-1;
                    } else {
                        low=mid+1;
                    }
                } else {
                    if(key>=a[mid]) {
                        high=mid-1;
                    } else {
                        low=mid+1;
                    }

                }
            }
            return -1;
            
            
        }
    
    
    public static void main(String[] args) {
        int arr[]={20,17,15,13,12,10,9,8,7,6,5,4};
        int key =9;
        System.out.print(agnosticsearch(arr,key));
    }
}

/*public class Agnosticsearch {

    public static int agnosticsearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                return mid;
            }

            if (a[0] <= a[1]) {
                if (key < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {20, 17, 15, 13, 12, 10, 9, 8, 7, 6, 5, 4};
        int key = 9;
        System.out.print(agnosticsearch(arr, key));
    }
}
*/
