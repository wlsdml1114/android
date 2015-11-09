package com.example.jini.practical8_5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by jini on 2015-11-06.
 */
public class MyAlarmService extends Service {
    public void onCreate(){
        Toast.makeText(this, "MyAlarmService.onCreate()", Toast.LENGTH_LONG).show();
    }
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this,"MyAlarmService.onBind()",Toast.LENGTH_LONG).show();
        return null;
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"MyAlarmService.onDestroy()",Toast.LENGTH_LONG).show();

    }
    public void onStart(Intent intent, int startId){
        super.onStart(intent, startId);
        Toast.makeText(this,"MyAlarmService.onStart()",Toast.LENGTH_LONG).show();
    }
    public boolean onUnbind(Intent intent){

        Toast.makeText(this,"MyAlarmService.onUnbind()",Toast.LENGTH_LONG).show();
        return super.onUnbind(intent);
    }
}
