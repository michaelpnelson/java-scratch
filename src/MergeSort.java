import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
//        Integer[] testArray = {10, 5, 7, 6, 8, 9, 4, 3, 2, 1};
        Integer[] testArray = {12, 9, 4, 99, 120, 1, 3, 10};
        List<Integer> test = new ArrayList<Integer>(Arrays.asList(testArray));
        System.out.println("Unsorted list:");
        System.out.println(test);
        List<Integer> sorted = ms.mergeSort(test);
        System.out.println("Sorted list:");
        System.out.println(sorted);
        
    }
    
    public List<Integer> mergeSort(List<Integer> m) {
        if (m.size() <=1) return m;
        else {
            List<Integer> left = new ArrayList<Integer>(), right = new ArrayList<Integer>();
            int middle = m.size() / 2;
            for (int i = 0; i < m.size(); i++) {
                if ((i+1) <= middle) {
                    left.add(m.get(i));
                } else {
                    right.add(m.get(i));
                }
            }
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
    }
    
    public List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<Integer>();
        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0 && right.size() > 0) {
                if (left.get(0) <= right.get(0)) {
                    result.add(left.get(0));
                    left = tail(left);
                } else {
                    result.add(right.get(0));
                    right = tail(right);
                }
            } else if (left.size() > 0) {
                result.add(left.get(0));
                left = tail(left);
            } else if (right.size() > 0) {
                result.add(right.get(0));
                right = tail(right);
            }
        }
        return result;
    }
    
    private List<Integer> tail(List<Integer> l) {
        return l.size() == 1 ? new ArrayList<Integer>() : l.subList(1,  l.size());
    }
}
