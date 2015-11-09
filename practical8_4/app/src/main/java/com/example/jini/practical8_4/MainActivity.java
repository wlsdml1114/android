package com.example.jini.practical8_4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
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

public class MainActivity extends ActionBarActivity {
    private static final int MY_NOTIFICATION_ID=1;
    private NotificationManager notificationManager;
    private Notification myNotification;
    private final String myGoogle= "http://www.google.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                EditText edt1 =(EditText)findViewById(R.id.edt1);
                EditText edt2 =(EditText)findViewById(R.id.edt2);
                EditText edt3 =(EditText)findViewById(R.id.edt3);
                myNotification = new Notification(R.drawable.icon, edt1.getText().toString(), System.currentTimeMillis());
                Context context = getApplicationContext();
                String notificationTitle = edt2.getText().toString();
                String notificationText = edt3.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myGoogle));
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, Intent.FLAG_ACTIVITY_NEW_TASK);
                myNotification.defaults |= Notification.DEFAULT_SOUND;
                myNotification.flags |= Notification.FLAG_AUTO_CANCEL;
                myNotification.setLatestEventInfo(context, notificationTitle, notificationText, pendingIntent);
                notificationManager.notify(MY_NOTIFICATION_ID, myNotification);
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
