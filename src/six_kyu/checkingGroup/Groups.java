package six_kyu.checkingGroup;

/**
 * Created by Hawk on 2017-04-20.
 */
public class Groups {


    public static boolean groupCheck(String group) {

        String[] arr = group.split("");
        boolean status = false;
        int position = 0;

        for(int i = (arr.length-1); i >= 0; i--){
            if(arr[i] == arr[position]){
                status = true;
            }
        }
        return status;
    }
}
