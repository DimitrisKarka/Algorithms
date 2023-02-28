public class Bubblesort {  

    public static void main(String[] args) {
        int[] arr = {1,3,24,3,5,213,5,6345,7,6,5,8,9};
        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j , j + 1);
                }
            }
        }
        for(int values : arr){
            System.out.print(values + " ");
        }
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
