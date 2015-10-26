package com.example.jini.practical7_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "Android";
                String ps = "123456";
                int check1=0,check2=0;
                EditText edt = (EditText)findViewById(R.id.edt1);
                EditText edt2 = (EditText)findViewById(R.id.edt2);
                if(id.equals(edt.getText().toString())){
                    check1=1;
                }
                if(ps.equals(edt2.getText().toString())){
                    check2=1;
                }
                if(check1==1&&check2==1) {
                    Intent obj = new Intent(MainActivity.this, second.class);
                    startActivity(obj);
                }
                else {
                    Intent fail = new Intent(MainActivity.this, thrid.class);
                    startActivity(fail);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
