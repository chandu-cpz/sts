public class lexicographicallyFirstPalindrome {
    public static String findLexicographicPalindrome(int length) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < length / 2; i++) {
            result.append('a');
        }
        
        if (length % 2 != 0) {
            result.append('a');
        }
        
        for (int i = length / 2 - 1; i >= 0; i--) {
            result.append(result.charAt(i));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        int length = 5; // You can change this to any desired length
        String palindrome = findLexicographicPalindrome(length);
        System.out.println("Lexicographically first palindrome of length " + length + ": " + palindrome);
    }
}
