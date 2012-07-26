package ninetynineproblems;

public class P06 {

    public static void main(String[] args) {
        int[] list = new int[] {1, 2, 3, 2, 1};
        boolean isPalindrome = new P06().isPalindrome(list);
        System.out.println("is palindrome: " + isPalindrome);
    }

    public boolean isPalindrome(int[] list) {
        int mid = list.length / 2;
        int j = list.length;
        boolean isPalindrome = true;
        for (int i = 0; i < mid; i++) {
            j--;
            if (list[i] != list[j]) isPalindrome = false;
        }
        return isPalindrome;
    }
}
