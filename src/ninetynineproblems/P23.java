package ninetynineproblems;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class P23 {

    /**
     * P23 (**) Extract a given number of randomly selected elements from a list.
         Example:

         scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
         res0: List[Symbol] = List('e, 'd, 'a)
     */
    public static final void main(String[] args) {
        char[] list = new char[] {'a', 'b', 'c', 'd', 'f', 'g', 'h'};
        char[] randomList = new P23().randomSelect(3, list);
        for (char c : randomList) System.out.print(c + " ");
    }

    public char[] randomSelect(int count, char[] list) {
        char[] newList = new char[count];
        Set<Integer> usedRandomIndexes = new HashSet<Integer>();
        for (int i = 0; i < count; i++) {
            int randomIdx = new Random().nextInt(list.length);
            while (usedRandomIndexes.contains(randomIdx)) {
                randomIdx = new Random().nextInt(list.length);
            }
            usedRandomIndexes.add(randomIdx);
            newList[i] = list[randomIdx];
        }
        return newList;
    }
}
