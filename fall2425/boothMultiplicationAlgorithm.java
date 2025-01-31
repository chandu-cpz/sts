import java.util.Scanner;

public class boothMultiplicationAlgorithm {
    public static int boothMultiply(int multiplicand, int multiplier) {
        int product = 0;
        int m = multiplicand;
        int r = multiplier;
        int x = 0;
        int count = 32; // Assuming 32-bit integers

        while (count > 0) {
            // Check the least significant bit of r and x
            if ((r & 1) == 1 && (x & 1) == 0) {
                product -= m;
            } else if ((r & 1) == 0 && (x & 1) == 1) {
                product += m;
            }

            // Arithmetic right shift the product and r
            x = r & 1;
            r = (r >> 1) | ((product & 1) << 31);
            product = product >> 1;

            count--;
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplicand: ");
        int multiplicand = scanner.nextInt();

        System.out.print("Enter the multiplier: ");
        int multiplier = scanner.nextInt();

        int result = boothMultiply(multiplicand, multiplier);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
