import java.util.Random;

public class binaryPalindrome {

    // Original implementation
    public static boolean originalIsBinaryPalindrome(int x) {
        int reversed = 0;
        int original = x;
        while (x > 0) {
            reversed <<= 1;
            reversed |= (x & 1);
            x >>= 1;
        }
        return reversed == original;
    }

    // Optimized implementation
    public static boolean optimizedIsBinaryPalindrome(int x) {
        if (x < 0)
            return false;
        int copy = x;
        int reversed = 0;
        while (copy > 0) {
            reversed = (reversed << 1) | (copy & 1);
            copy >>>= 1;
        }

        return x == reversed;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int testCases = 1000000; // Number of test cases
        int maxValue = 1000000; // Maximum value to test (10^6)

        long startTime, endTime;
        long originalTotalTime = 0, optimizedTotalTime = 0;

        System.out.println("Starting stress test...");

        for (int i = 0; i < testCases; i++) {
            int testValue = rand.nextInt(maxValue + 1);

            // Test original implementation
            startTime = System.nanoTime();
            boolean originalResult = originalIsBinaryPalindrome(testValue);
            endTime = System.nanoTime();
            originalTotalTime += (endTime - startTime);

            // Test optimized implementation
            startTime = System.nanoTime();
            boolean optimizedResult = optimizedIsBinaryPalindrome(testValue);
            endTime = System.nanoTime();
            optimizedTotalTime += (endTime - startTime);

            // Check if results match
            if (originalResult != optimizedResult) {
                System.out.printf("Mismatch found for value %d: Original: %b, Optimized: %b%n",
                        testValue, originalResult, optimizedResult);
            }
        }

        System.out.println("Stress test completed.");
        System.out.printf("Original implementation total time: %.3f ms%n", originalTotalTime / 1e6);
        System.out.printf("Optimized implementation total time: %.3f ms%n", optimizedTotalTime / 1e6);
        System.out.printf("Optimized version is %.2f times faster%n",
                (double) originalTotalTime / optimizedTotalTime);
    }
}
