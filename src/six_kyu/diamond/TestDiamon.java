package six_kyu.diamond;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Hawk on 2017-04-18.
 */
public class TestDiamon {


    @Test
    public void IsDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        Assert.assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void IsDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        Assert.assertEquals(expected.toString(), Diamond.print(5));
    }
}
