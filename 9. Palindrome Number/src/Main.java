public class Main {
    public static void main(String[] args) {

        boolean isPalindrome = false;

        int x = 123321;
        String s = String.valueOf(x);
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {

            if (s.charAt(i) != s.charAt(len - 1 - i) ) {
                isPalindrome = false;
            } else {
                isPalindrome = true;
            }
        }

        if (isPalindrome) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }

    }
}