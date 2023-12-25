public class Minimumlength {
    public static int findMinimumLength(int[] a, int[] b) {
        int startidx = 0;
        int endidx = 0;

        // Find the starting index where elements differ
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                startidx = i;
                break;
            }
        }

        // Find the ending index where elements differ
        for (int j = startidx; j < a.length; j++) {
            if (a[j] != b[j]) {
                endidx = j;
            } else {
                continue;
            }
        }

        return endidx - startidx + 1;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,1};
        int[] b = {2,1,1,1};
        System.out.print(findMinimumLength(a, b));
    }
}
