import java.util.Scanner;

public class nibbleSwap {

    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4) | ((x & 0xF0) >> 4);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(swapNibbles(x));
        scanner.close();
    }
}
