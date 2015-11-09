package com.example.jini.practical8_5;

import android.app.AlarmManager;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

class data{
    private int hour, minute, hourofday;
    public void input(int a, int b, int c){
        hour=a;
        minute=c;
        hourofday=b;
    }
    public int get_hour(){return hour;}
    public int get_minute(){return minute;}
    public int get_hourofday(){return hourofday;}
}
public class MainActivity extends ActionBarActivity {
    private static final int MY_NOTIFICATION_ID=1;
    private NotificationManager notificationManager;
    private Notification myNotification;
    private final String myGoogle= "http://www.google.com/";
    private data d = new data();
    private FragmentManager fm = getFragmentManager();
    private PendingIntent pendingIntent;
    int hour, minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        GregorianCalendar calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(MainActivity.this, timeSetListener,hour,minute, false).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fdialog f = new fdialog();
                f.show(fm,"");
            }
        });
    }
    private TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener(){

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            d.input(0,hourOfDay,minute);

            notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            myNotification = new Notification(R.drawable.icon,"Alarm1", System.currentTimeMillis());
            Context context = getApplicationContext();
            String notificationTitle = "Alarm is Setting!";
            String notificationText = "Alarm is" + d.get_hourofday() + "시" + d.get_minute()+"분";
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(myGoogle));
            PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent2, Intent.FLAG_ACTIVITY_NEW_TASK);
            myNotification.defaults |= Notification.DEFAULT_SOUND;
            myNotification.flags |= Notification.FLAG_AUTO_CANCEL;
            myNotification.setLatestEventInfo(context, notificationTitle, notificationText, pendingIntent);
            notificationManager.notify(MY_NOTIFICATION_ID, myNotification);

            Intent intent = new Intent(MainActivity.this,MyAlarmService.class);
            pendingIntent  = PendingIntent.getService(MainActivity.this,0,intent,0);
            AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.add(calendar.SECOND, 2);
            alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
            Toast.makeText(MainActivity.this,"ALARM START NOW",Toast.LENGTH_LONG).show();


        }
    };

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
