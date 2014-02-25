package se.cabasa.app;

/**
 * Created by Mersad on 2014-01-28.
 */

import android.app.Activity;
import android.os.Bundle;

public class DisplayNotification extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);
    }
}