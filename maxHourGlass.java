
import java.util.Scanner;

public class maxHourGlass {

    static int findMaxSum(int[][] mat, int R, int C) {
        // Check if it's possible to have hourglasses in the given matrix
        if (R < 3 || C < 3) {
            System.out.println("Not possible");
            System.exit(0);
        }

        int max_sum = Integer.MIN_VALUE;  // Set max_sum to a very low value to handle negative matrices
        int sum;

        // Loop to calculate the hourglass sum
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) 
                    + (mat[i + 1][j + 1]) 
                    + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
                
                max_sum = Math.max(max_sum, sum);  // Find the maximum sum
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the dimensions of the matrix
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int[][] mat = new int[R][C];
        
        // Input the matrix elements
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Call the function to find the maximum hourglass sum
        int res = findMaxSum(mat, R, C);
        System.out.println("Maximum sum of hourglass = " + res);
    }
}
