package zetrixweb.com.unittestingdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  boolean checker(String a)
    {
        int i,j;
        for(i=0 ,j = a.length()-1; i <= a.length()/2; i++,j--)
        {
            if(a.charAt(i)== a.charAt(j))
                continue;
            return  false;
        }
        return  true;
    }
}
