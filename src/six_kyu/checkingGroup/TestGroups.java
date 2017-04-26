package six_kyu.checkingGroup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hawk on 2017-04-20.
 */
public class TestGroups {

    @Test
    public void testCheckingGroup(){
        assertEquals(Groups.groupCheck("()"), true);
        //assertEquals(Groups.groupCheck("({"),false);
        //assertEquals(Groups.groupCheck("([]{})"),true);
    }
}
