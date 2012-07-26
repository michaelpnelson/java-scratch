package ninetynineproblems;

import java.util.ArrayList;
import java.util.List;

public class P13 {
    public static final void main(String[] args) {
        char[] list = new char[] {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        List<CountAndChar> encodedList = new P13().runLengthEncode(list);
        for (CountAndChar cc : encodedList) {
            System.out.println(cc.count + ", " + cc.character);
        }
    }

    private class CountAndChar {
        public int count;
        public char character;
        public CountAndChar(int count, char character) {
            this.count = count;
            this.character = character;
        }
    }

    List<CountAndChar> runLengthEncode(char[] list) {
        List<CountAndChar> retList = new ArrayList<CountAndChar>();
        int currCount = 0;
        char currChar;
        for (int i = 0; i < list.length; i++) {
            currChar = list[i];
            currCount++;
            if ((i + 1 < list.length && list[i] != list[i+1]) // next item is different
                    || i == list.length-1) { // end of list
                retList.add(new CountAndChar(currCount, currChar));
                currCount = 0;
            }
        }
        return retList;
    }
}
