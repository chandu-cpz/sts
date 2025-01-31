public class longestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0, maxLength = 1;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int lenMax = Math.max(len1, len2);

            if (lenMax > maxLength) {
                start = i - (lenMax - 1) / 2;
                maxLength = lenMax;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String test = "babad";
        System.out.println("Longest palindromic substring of '" + test + "' is: " + longestPalindrome(test));
    }
}
