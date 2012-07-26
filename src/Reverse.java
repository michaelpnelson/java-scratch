
public class Reverse {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println("Original: " + hello);
        String helloRev = new Reverse().reverse(hello);
        System.out.println("Reversed: " + helloRev);
    }
    
    public String reverse(String orig) {
        char[] arr = orig.toCharArray();
        char swap;
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length/2; i++) {
            swap = arr[j];
            arr[j] = arr[i];
            arr[i] = swap;
            j--;
        }
        return new String(arr);
    }

}
