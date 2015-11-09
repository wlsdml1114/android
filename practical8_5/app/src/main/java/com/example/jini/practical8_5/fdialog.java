package com.example.jini.practical8_5;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


/**
 * Created by jini on 2015-11-09.
 */
public class fdialog extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.dialog, container, false);
        Button btn = (Button)rootView.findViewById(R.id.summit);
        final TextView tv = (TextView)rootView.findViewById(R.id.tv);
        final EditText edt = (EditText)rootView.findViewById(R.id.edt);
        Random r = new Random();
        int a = r.nextInt(100);
        int b = r.nextInt(100);
        final int sum = a + b;
        String s = a + "+" + b + "=";
        tv.setText(s);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt.getText().toString().equals(Integer.toString(sum))) {
                    getDialog().dismiss();
                }
            }
        });
        return rootView;
    }
}
