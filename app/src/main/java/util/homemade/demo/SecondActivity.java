package util.homemade.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button submit;
    private EditText na;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        na =(EditText) findViewById(R.id.ed_name);
        submit = (Button) findViewById(R.id.bt_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedFile sf = new SharedFile(getApplicationContext());
                sf.putName(na.getText().toString());
                Intent i = MainActivity.getIntent(getApplicationContext());
                startActivity(i);
            }
        });


    }
}
