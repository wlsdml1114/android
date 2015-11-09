package com.example.jini.practical8_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by jini on 2015-11-02.
 */
public class Activity2 extends Activity {
    TextView tv;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        tv = (TextView)findViewById(R.id.tv2);
        tv.setTextSize(30);
        tv.setText("This is example of Pending Intent");
    }
}
