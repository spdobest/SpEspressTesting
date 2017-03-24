package sptecch.spespressotesting.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import sptecch.spespressotesting.BaseActivity;
import sptecch.spespressotesting.R;

/**
 * Login Activity
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //setup the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.tool_bar_title_login);
        setupToolbar(toolbar);

        //start fragment
        startFragment(LoginFragment.newInstance());
    }
}
