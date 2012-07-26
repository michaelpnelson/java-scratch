package ninetynineproblems;

public class P05 {
    public static void main(String[] args) {
        int[] list = new int[] {1, 1, 2, 3, 5, 8};
        System.out.println("Original list: ");
        for (int i : list) System.out.print(i);
        int[] revList = new P05().reverse(list);
        System.out.println("\nReversed list: ");
        for (int i : revList) System.out.print(i);
    }

    public int[] reverse(int[] list) {
        int half = list.length / 2;
        int swap;
        int j = list.length;
        for (int i = 0; i < half; i++) {
            j--;
            swap = list[j];
            list[j] = list[i];
            list[i] = swap;
        }
        return list;
    }
}
