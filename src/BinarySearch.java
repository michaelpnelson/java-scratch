import java.util.Arrays;


public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5, 6};
        boolean found = new BinarySearch().search(list, 3);
        System.out.println(found);
    }

    public boolean search(int[] list, int elem) {
        if (elem < list[0] || elem > list[list.length-1]) return false;
        int mid = list.length / 2;
        if (mid == 0) return true;
        else if (elem < list[mid]) {
            return search(Arrays.copyOf(list, mid), elem);
        } else {
            return search(Arrays.copyOfRange(list, mid, list.length), elem);
        }
    }
}
