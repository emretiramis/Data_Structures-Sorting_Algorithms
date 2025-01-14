package Sorting;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {5,8,7,9,6,3,1,4,2};
        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.print(i +" ");
        }

    }
    public static void quickSort(int[] array, int start, int end) {

        if(end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
