import java.util.Scanner;

public class nibbleSwap {
    // Method to swap the nibbles of a byte
    public static int swapNibbles(byte b) {
        // Extract the upper nibble (first 4 bits) by masking with 0xF0 and shifting right by 4
        byte upperNibble = (byte) ((b & 0xF0) >>> 4);
        // Extract the lower nibble (last 4 bits) by masking with 0x0F
        byte lowerNibble = (byte) (b & 0x0F);
        // Combine the swapped nibbles: 
        // - shift the lower nibble to the upper position (<< 4)
        // - keep the upper nibble in the lower position
        byte swappedByte = (byte) ((lowerNibble << 4) | upperNibble);
        // Return the byte with the swapped nibbles as an unsigned int
        return swappedByte & 0xFF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBytes = scanner.nextInt();
        // Convert numBytes to byte
        byte byteValue = (byte) numBytes;
        // Call the swapNibbles method to swap the nibbles of byteValue
        int swappedByte = swapNibbles(byteValue);
        System.out.println(swappedByte);
        scanner.close();

    }
}
