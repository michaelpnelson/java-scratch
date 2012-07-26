package ninetynineproblems;

import java.util.ArrayList;
import java.util.List;

public class P26 {

    /**
     P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
         In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.

         Example:

         scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
         res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
     */
    public static final void main(String[] args) {
        char[] list = new char[] {'a', 'b', 'c', 'd', 'e', 'f'};
        List<char[]> comboList = new P26().combinations(3, list);
        for (char[] ca : comboList) {
            System.out.println();
            for (char c : ca) System.out.print(c);
        }
        assert(comboList.size() == 220);
    }

    public List<char[]> combinations(int digits, char[] list) {
        List<char[]> comboList = new ArrayList<char[]>();
        int[] counters = new int[digits];
        // initialise
        for (int i = 0; i < digits; i++) {
            counters[i] = i;
        }

        /**
         * THIS IS CHEATING because we know beforehand that there are 3 digits ...
         * is it possible to do this with N digits? Without passing functions?
         */
        for (int f = counters[0]; f < list.length; f++) {
            for (int s = counters[1]; s < list.length; s++) {
                for (int t = counters[2]; t < list.length; t++) {
                    comboList.add(new char[]{list[f], list[s], list[t]});
                }
                counters[0] = 0;
            }
            counters[1] = 0;
        }

        return comboList;
    }
}
