package ca.truewebdev.flickrbrowser;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by True on 2/26/2016.
 */
public class BaseActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    protected Toolbar activateToolbar() {
        if(mToolbar == null) {
            mToolbar = (Toolbar)
                    findViewById(R.id.app_bar);
            if(mToolbar != null) {
                setSupportActionBar(mToolbar);
            }
        }
        return mToolbar;
    }
}

