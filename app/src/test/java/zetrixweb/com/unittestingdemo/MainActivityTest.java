package zetrixweb.com.unittestingdemo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by admin on 12/07/17.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @SmallTest
    public void  testedittext()
    {
        EditText et = (EditText)getActivity().findViewById(R.id.editText);
        assertNotNull(et);
    }

    @SmallTest
    public void  testbutton()
    {
        Button bt = (Button)getActivity().findViewById(R.id.button);
        assertNotNull(bt);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
