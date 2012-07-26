import java.util.*;


public class QuickSort {

    public static void main(String[] args) {
      QuickSort qs = new QuickSort();
      Integer[] testArray = {10, 5, 7, 6, 8, 9, 4, 3, 2, 1};
//      Integer[] testArray = {12, 9, 4, 99, 120, 1, 3, 10};
      List<Integer> test = new ArrayList<Integer>(Arrays.asList(testArray));
      System.out.println("Unsorted list:");
      System.out.println(test);
      List<Integer> sorted = qs.quicksort(test);
      System.out.println("Sorted list:");
      System.out.println(sorted);
    }

    public List<Integer> quicksort(List<Integer> list) {
        if (list.size() == 0) return list;
        else {
            int pivot = list.get(0);
            List<Integer> smaller = new ArrayList<Integer>();
            List<Integer> bigger = new ArrayList<Integer>();
            for (int i : list) {
                if (i != pivot) {
                    if (i <= pivot) smaller.add(i);
                    else bigger.add(i);
                }
            }
            List<Integer> smallerSorted = quicksort(smaller);
            List<Integer> biggerSorted = quicksort(bigger);
            
            // put the three together and return it
            List<Integer> fullList = new ArrayList<Integer>(smallerSorted);
            fullList.add(pivot);
            fullList.addAll(biggerSorted);
            return fullList;
        }
    }
}
