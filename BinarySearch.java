import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        arr[0] = -1;
        Random rand = new Random(); 
        int space = 100;
        int target = 435;  //target is the number you want to find,  if it exists an its postition
        for(int i = 1; i < arr.length; i++){
            int num = -10;
            while(num < arr[i - 1]){
                num = rand.nextInt(space);
            }
            arr[i] = num;  
            space += 100;       //not needed i just put it for variability   
        }
        for(int a : arr){
            System.out.println(a);
        }
        int  position = binarySearch(arr, target);
        System.out.println(position);
    }
    
    // the actual binary search function
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target == arr[mid]){
                return mid;
            }
        }
        return -1; 
    }

}
