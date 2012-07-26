import java.util.*;


public class CountUnique {

    public static void main(String[] args) {
        int[] list = {1, 1, 1, 2, 3, 3};
        Map<Integer, Integer> uniquesAndCounts = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.length; i++) {
            if (!uniquesAndCounts.containsKey(list[i])) 
                uniquesAndCounts.put(list[i], 1);
            else 
                uniquesAndCounts.put(list[i], uniquesAndCounts.get(list[i]) + 1);
        }
        
        Iterator<Integer> it = uniquesAndCounts.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println(key + " -> " + uniquesAndCounts.get(key));
        }
    }

}
