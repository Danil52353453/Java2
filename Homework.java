

import java.util.Arrays;

class BubbleSorter {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 2, 2, 1},
                {4, 10, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 2, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            Homework.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

    public class Homework {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
