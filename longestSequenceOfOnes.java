
import java.util.Scanner;

public class LongestSequenceOfOnes {
    public static int flipBit(int n) {
        // If all bits are 1, flipping won't help
        if (~n == 0) return 32;

        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 1;  // Start with 1 as we can always flip a 0 to 1
        
        while (n != 0) {
            if ((n & 1) == 1) {
                currentLength++;
            } else {
                // When we encounter a 0, we can potentially flip it
                // So, we consider the sum of previous and current lengths, plus 1 for this bit
                maxLength = Math.max(maxLength, previousLength + currentLength + 1);
                previousLength = currentLength;
                currentLength = 0;
            }
            n >>>= 1;  // Unsigned right shift
        }

        // Check one last time, for cases where the sequence ends with 1s
        return Math.max(maxLength, previousLength + currentLength + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int longestSequence = flipBit(n);
        System.out.println(longestSequence);
        sc.close();
    }
}
