import java.util.ArrayList;
import java.util.Arrays;

public class blockSwap {
    static void leftRotate(ArrayList<Integer> list, int d) {
        int n = list.size();
        d = d % n; // in case d is larger than n

        for (int i = 0; i < d; i++) {
            int element = list.remove(0);
            list.add(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Original list: " + list);

        leftRotate(list, 2);
        System.out.println("After rotation: " + list);
    }
}
