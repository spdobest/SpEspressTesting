package sptecch.spespressotesting.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import sptecch.spespressotesting.BaseActivity;
import sptecch.spespressotesting.R;


/**
 * Created by mayowa.adegeye on 31/05/2016.
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setupToolbar(toolbar);

        //start fragment
        startFragment(MainFragment.newInstance());
    }
}
