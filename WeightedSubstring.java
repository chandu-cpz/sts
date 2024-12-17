
import java.util.Scanner;

public class WeightedSubstring{

    // Function to calculate the weight of characters A-Z based on the given formula
    public static int[] calculateWeights() {
        int[] weights = new int[26];
        weights[0] = 1; // A has a weight of 1
        for (int i = 1; i < 26; i++) {
            weights[i] = (i + 1) * weights[i - 1] + weights[i - 1];
        }
        return weights;
    }

    // Function to calculate the total weight of a given string
    public static int calculateStringWeight(String s) {
        int[] weights = calculateWeights(); // Pre-calculate the weights of characters
        int totalWeight = 0;
        // Traverse through the string and calculate its weight
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            totalWeight += weights[c - 'A']; // Add the weight of the current character
        }
        return totalWeight; // Return the total weight of the string
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string
        // Calculate and print the weight of the string
        int weight = calculateStringWeight(input);
        System.out.println("The weight of the string is: " + weight);
        // Close the scanner
        scanner.close();
    }
}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    static int[] values = new int[26];

    public static void main(String[] args) {
        insertValues();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Character> s = new ArrayList<>(n);
        formedString(s, n);
    }

    static void insertValues() {
        values[0] = 1;
        int prev = 1;

        for (int i = 1; i < 26; i++) {
            values[i] = (i + 1) * prev + prev;
            prev = values[i];
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(values[i]);
        }
    }

    static void formedString(List<Character> s, int n) {
        int low = 0;
        int high = 25;
        while (n != 0) {
            int ind = findFloor(n, low, high);
            s.add((char) (ind + 'A'));
            n = n - values[ind];
            high = ind - 1;
        }

        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.print(s.get(i));
        }
    }

    static int findFloor(int k, int low, int high) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (values[mid] <= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
        return ans;
    }
}

