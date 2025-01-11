package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr1 = {5, 8, 7, 9, 6, 3, 1, 4, 2};
        bubbleSort(arr1);

        for (int i : arr1) {
            System.out.print(i + " ");
        }


    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}