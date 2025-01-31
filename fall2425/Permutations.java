import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> permutations = new ArrayList<>();
        boolean[] used = new boolean[chars.length];
        permute(chars, used, "", permutations);
        Collections.sort(permutations);
        System.out.println(String.join(" ", permutations));
        scanner.close();
    }

    static void permute(char[] arr, boolean[] used, String path, List<String> result) {
        if (path.length() == arr.length) {
            result.add(path);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            permute(arr, used, path + arr[i], result);
            used[i] = false;
        }
    }
}