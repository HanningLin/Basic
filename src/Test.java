public class Test {

    /**
     * Given an array of non-negative integers arr[].
     * The task is to find the largest number in the array which is palindrome.
     * If no such number exits then print -1.
     */
    public static int largestPalindrome(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new NullPointerException();
        }

        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                res = Math.max(res, arr[i]);
            }
        }
        System.out.println(res);
        return res;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (original > 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == num;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 232, 45654, 99};
        largestPalindrome(arr);
    }
}
