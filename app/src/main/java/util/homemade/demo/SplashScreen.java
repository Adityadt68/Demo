package util.homemade.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Narayan on 02/02/2017.
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedFile sf = new SharedFile(getApplicationContext());
        if(sf.findOut() ) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
