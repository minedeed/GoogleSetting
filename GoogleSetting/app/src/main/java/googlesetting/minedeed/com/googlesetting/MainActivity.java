package googlesetting.minedeed.com.googlesetting;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mIntent = new Intent( );
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ComponentName comp = new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink");
        mIntent.setComponent(comp);
       // mIntent.setAction("android.intent.action.VIEW");
        startActivity(mIntent);
        finish();

    }
}
