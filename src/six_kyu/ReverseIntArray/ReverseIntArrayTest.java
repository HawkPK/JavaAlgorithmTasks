package six_kyu.ReverseIntArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Hawk on 2017-04-26.
 */
public class ReverseIntArrayTest {

    @Test
    public void DoesSortCorrectly(){
        Assert.assertTrue(Arrays.equals(new int[]{3,2,1}, ReverseIntArray.reverseArr(new int[]{1,2,3})));
        Assert.assertTrue(Arrays.equals(new int[]{8,7,6,5,4,3,2,1}, ReverseIntArray.reverseArr(new int[]{1,2,3,4,5,6,7,8})));
    }
}
