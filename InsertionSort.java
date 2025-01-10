package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr1 = {5,8,7,9,6,3,1,4,2};
        InsertionSort(arr1);

        for(int i : arr1){
            System.out.print(i +" ");
        }

    }
    public static void InsertionSort(int[] array){
        for (int i = 1; i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    }
}
