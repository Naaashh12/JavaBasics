public class RotatedPlaces {

    public static int findrotatedplaces(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int next = (mid + 1); //% a.length;
            int prev = (mid   - 1) ;//% a.length;

            // Smallest element
            if (a[mid] < prev && a[mid] < next) {
                return a.length-mid;
            } else if (a[low] < a[mid]) {
                low = mid ;
            } else if(a[high]>a[mid]) {
                high = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 18, 2, 5, 6, 8,11,12,15};
        System.out.println("Number of rotations: " + findrotatedplaces(arr));
    }
}
