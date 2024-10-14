
public class karatsubaMultiplication {

    public static long karatsubaMultiply(long x, long y) {
        // Base case for recursion
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size of the numbers
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n + 1) / 2;

        // Split the digit sequences in the middle
        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10, half);
        long d = y % (long) Math.pow(10, half);

        // Recursively calculate the three products
        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long adbc = karatsubaMultiply(a + b, c + d) - ac - bd;

        // Combine the three products to get the final result
        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }

    public static void main(String[] args) {
        long x = 2356;
        long y = 4512;
        long product = karatsubaMultiply(x, y);
        System.out.println("Product: " + product);
    }
}
