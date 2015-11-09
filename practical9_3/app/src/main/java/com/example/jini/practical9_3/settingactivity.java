package com.example.jini.practical9_3;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by jini on 2015-11-09.
 */
public class settingactivity extends PreferenceActivity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting);
    }
}
