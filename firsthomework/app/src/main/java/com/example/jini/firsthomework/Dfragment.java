package com.example.jini.firsthomework;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jini on 2015-10-20.
 */
public class Dfragment extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.dfragment,container,false);
        final EditText edt = (EditText)rootView.findViewById(R.id.edt);
        Button btn = (Button)rootView.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                alertdf alertdf = new alertdf();
                alertdf.Name(edt.getText().toString());
                alertdf.show(fm,"");
                getDialog().dismiss();
            }
        });
        return rootView;
    }
}
