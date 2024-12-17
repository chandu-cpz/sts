import java.util.Scanner;

public class manacher {
    public static String longestPalindrome(String s) {
        int start = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Even length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            // Find the maximum
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    
    // Helper function to expand around the center and find palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("Longest Palindrome: " + longestPalindrome(s));
        scanner.close();
    }
}