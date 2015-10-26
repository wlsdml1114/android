package com.example.jini.practical7_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jini on 2015-10-26.
 */
public class GreetingActivity extends Activity {
    TextView tv;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting);
        tv = (TextView)findViewById(R.id.greetingtv);
        Intent intObj = getIntent();
        String uname = (String)intObj.getSerializableExtra("USERNAME");
        tv.setText("Welcome" + uname);
    }
}
