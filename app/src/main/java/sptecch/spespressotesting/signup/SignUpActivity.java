package sptecch.spespressotesting.signup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import sptecch.spespressotesting.BaseActivity;
import sptecch.spespressotesting.R;


/**
 * Created by mayowa.adegeye on 31/05/2016.
 */
public class SignUpActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.tool_bar_title_sign_up);
        setupToolbar(toolbar);

        //start fragment
        startFragment(SignUpFragment.newInstance());
    }
}
