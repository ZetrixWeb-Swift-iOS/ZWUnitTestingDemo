package zetrixweb.com.unittestingdemo;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by admin on 12/07/17.
 */

public class MainActivityUnitTest extends TestCase  {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testchecker()
    {
        MainActivity  ma = new MainActivity();
        boolean result= ma.checker("MOM");
        assertEquals(true,result);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
