
public class euclidGCD {

    // Iterative method to calculate GCD using Euclid's algorithm
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursive method to calculate GCD using Euclid's algorithm
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48; // Example number 1
        int num2 = 18; // Example number 2

        // Calculate GCD using both methods
        int gcdIter = gcdIterative(num1, num2);
        int gcdRec = gcdRecursive(num1, num2);

        // Display the results
        System.out.println("The GCD of " + num1 + " and " + num2 + " (Iterative) is: " + gcdIter);
        System.out.println("The GCD of " + num1 + " and " + num2 + " (Recursive) is: " + gcdRec);
    }
}
