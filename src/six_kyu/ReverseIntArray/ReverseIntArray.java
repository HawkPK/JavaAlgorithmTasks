package six_kyu.ReverseIntArray;

/**
 * Created by Hawk on 2017-04-26.
 */
public class ReverseIntArray {
    public static int[] reverseArr(int[] arr) {

        for(int i =0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
