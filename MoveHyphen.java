
import java.util.Scanner;

public class MoveHyphen {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string
        // Move hyphens to the beginning of the string
        String result = moveHyphensToBeginning(input);
        // Print the result
        System.out.println("Modified string: " + result);
        // Close the scanner
        scanner.close();
    }

    // Function to move hyphens to the beginning of the string
    public static String moveHyphensToBeginning(String s) {
        StringBuilder hyphens = new StringBuilder();
        StringBuilder nonHyphens = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '-') {
                hyphens.append(c);
            } else {
                nonHyphens.append(c);
            }
        }

        return hyphens.toString() + nonHyphens.toString();
    }
}
