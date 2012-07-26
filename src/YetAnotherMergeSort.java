
public class YetAnotherMergeSort {

    /**
     * Assumes both input lists are already sorted
     */
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 10, 15};
        int[] b = {10, 20, 21, 30};
        int[] merged = new YetAnotherMergeSort().mergeSort(a, b);
        System.out.println("Merged:");
        for (int i = 0; i < merged.length; i++)
            System.out.print(merged[i] + "  ");

    }

    public int[] mergeSort(int[] a, int[] b) {
        int newLength = a.length + b.length;
        int[] arr = new int[newLength];
        int aIdx = 0, bIdx = 0, arrIdx = 0;
        for (int i = 0; i < newLength; i++) {
            if (aIdx < a.length && a[aIdx] < b[bIdx]) {
                arr[arrIdx] = a[aIdx];
                aIdx++;
            } else if (bIdx < b.length) {
                arr[arrIdx] = b[bIdx];
                bIdx++;
            }
            arrIdx++;
        }
        return arr;
    }
}
