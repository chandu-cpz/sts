public class leadersInArray {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        findLeaders(array);
    }

    public static void findLeaders(int[] array) {
        int length = array.length;
        int max = array[length - 1]; // The last element is always a leader
        System.out.print(max + " ");

        for (int i = length - 2; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                System.out.print(max + " ");
            }
        }
    }
}
