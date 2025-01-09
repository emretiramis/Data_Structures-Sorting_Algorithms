package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr1 = {5,8,7,9,6,3,1,4,2};
        SelectionSort(arr1);

        for(int i : arr1){
            System.out.print(i +" ");
        }

    }
    private static void SelectionSort(int[] array){
        for(int i = 0; i < array.length-1;i++){
            int min = i;
            for (int j = i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}

