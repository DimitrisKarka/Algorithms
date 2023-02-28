public class InsertionSort {  

    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        insertionSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    private static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            shift(arr, arr[i], i);
        }
    }

    private static void shift(int[] arr, int temp, int pos){
        if(pos == 0 || arr[pos - 1] >= temp){
            arr[pos] = temp;
            return;
        }
        else{
            arr[pos] = arr[pos - 1];
            pos--;
            shift(arr, temp, pos);
        }
    }

}
