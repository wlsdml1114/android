package com.example.jini.practical10_2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = (TextView)findViewById(R.id.output);
        String emailStr = refreshDate();
        output.setText(emailStr);
    }

    private String refreshDate(){
        String Date = "";
        try{
            String[] projection = new String[]{
                    ContactsContract.Contacts._ID,
                    ContactsContract.Contacts.DISPLAY_NAME,
                    ContactsContract.Contacts.HAS_PHONE_NUMBER
            };
            ContentResolver cr = getBaseContext().getContentResolver();
            Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI,projection,null,null,null);
            if(cursor.getCount()>0){
                cursor.moveToFirst();
                while(cursor.moveToNext()){
                    String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
                    String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                    Date+= "\n Name : "+name;
                    if(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER)).equals("1")){
                        Cursor cs = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                                null,
                                ContactsContract.CommonDataKinds.Phone.CONTACT_ID+"=?",new String[]{id},null);
                        Cursor email = cr.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI,
                                null,
                                ContactsContract.CommonDataKinds.Email.CONTACT_ID+"=?",new String[]{id},null);
                        while(cs.moveToNext()&&email.moveToNext()){
                            Date += "\nNumber : " + cs.getString(cs.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                            Date += "\nEmail : " + email.getString(email.getColumnIndex(ContactsContract.CommonDataKinds.Email.DATA))+"\n";
                        }
                    }
                }
            }
//            ContentResolver cr = getBaseContext().getContentResolver();
//            Cursor cur = cr.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);
//            if(cur.moveToNext()){
//                String contactId = cur.getString(cur.getColumnIndex(ContactsContract.Contacts._ID));
//                Cursor phone = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID+" = "+contactId,null,null);
//                while(phone.moveToNext()){
//                    String phoneN = phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
//                    Date +=" "+phoneN;
//                }
//                phone.close();
//            }
//            else{
//                Date += "Data not fount";
//            }
        }
        catch (Exception e){
            Date = ""+e+"";
        }
        return Date;
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
class ContactsStructure{
    public String str_ID;
    public String str_Display_Name;
    public String str_has_phone_number;
    public String str_phone_number_count;
    public String str_phone_number;
    public ContactsStructure(){
        str_ID=null;
        str_Display_Name=null;
        str_has_phone_number=null;
        str_phone_number=null;
        str_phone_number_count=null;
    }
}