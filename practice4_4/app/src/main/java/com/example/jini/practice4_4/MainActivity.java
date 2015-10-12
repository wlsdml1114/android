package com.example.jini.practice4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button plus;
    Button minus;
    Button multi;
    Button clear;
    Button devide;
    Button equal;
    EditText edt;
    class string{
        private String s;
        string(){
            s="";
        }
        void add(String input){
            s = s+input;
        }
        String get(){
            return s;
        }
        void clear(){
            s="";
        }
        String cal(){
            String result = "";
            if(s.contains("+")){
                int i = s.indexOf("+");
                int sum = Integer.parseInt(s.substring(0,i))+Integer.parseInt(s.substring(i+1,s.length()));
                result = Integer.toString(sum);
            }
            if(s.contains("-")){
                int i = s.indexOf("-");
                int sum = Integer.parseInt(s.substring(0,i))-Integer.parseInt(s.substring(i+1,s.length()));
                result = Integer.toString(sum);
            }
            if(s.contains("*")){
                int i = s.indexOf("*");
                int sum = Integer.parseInt(s.substring(0,i))*Integer.parseInt(s.substring(i+1,s.length()));
                result = Integer.toString(sum);
            }
            if(s.contains("/")){
                int i = s.indexOf("/");
                int sum = Integer.parseInt(s.substring(0,i))/Integer.parseInt(s.substring(i+1,s.length()));
                result = Integer.toString(sum);
            }
            return result;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final string s = new string();

        edt = (EditText)findViewById(R.id.edt);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("1");
                edt.setText(s.get());
            }
        });

        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("2");
                edt.setText(s.get());
            }
        });

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("3");
                edt.setText(s.get());
            }
        });

        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("4");
                edt.setText(s.get());
            }
        });

        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("5");
                edt.setText(s.get());
            }
        });

        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("6");
                edt.setText(s.get());
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("7");
                edt.setText(s.get());
            }
        });

        btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("8");
                edt.setText(s.get());
            }
        });

        btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("9");
                edt.setText(s.get());
            }
        });

        btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("0");
                edt.setText(s.get());
            }
        });

        plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("+");
                edt.setText(s.get());
            }
        });

        minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("-");
                edt.setText(s.get());
            }
        });

        multi = (Button)findViewById(R.id.multi);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("*");
                edt.setText(s.get());
            }
        });

        devide = (Button)findViewById(R.id.devide);
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.add("/");
                edt.setText(s.get());
            }
        });

        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.clear();
                edt.setText(s.get());
            }
        });

        equal = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(s.cal());
                s.clear();
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
