package com.example.jini.firsthomework;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton im1;
    ImageButton im2;
    ImageButton im3;
    ImageButton im4;
    ImageButton im5;
    ImageButton im6;
    ImageButton im7;
    ImageButton im8;
    ImageButton im9;
    ImageButton im10;
    ImageButton im11;
    ImageButton im12;
    ImageButton im13;
    ImageButton im14;
    ImageButton im15;
    ImageButton im16;
    ImageButton im17;
    ImageButton im18;
    ImageButton im19;
    ImageButton im20;
    ImageButton im21;
    ImageButton im22;
    ImageButton im23;
    ImageButton im24;
    ImageButton im25;
    FragmentManager fm = getFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Check check = new Check();
        im1 = (ImageButton)findViewById(R.id.im1);
        im2 = (ImageButton)findViewById(R.id.im2);
        im3 = (ImageButton)findViewById(R.id.im3);
        im4 = (ImageButton)findViewById(R.id.im4);
        im5 = (ImageButton)findViewById(R.id.im5);
        im6 = (ImageButton)findViewById(R.id.im6);
        im7 = (ImageButton)findViewById(R.id.im7);
        im8 = (ImageButton)findViewById(R.id.im8);
        im9 = (ImageButton)findViewById(R.id.im9);
        im10 = (ImageButton)findViewById(R.id.im10);
        im11 = (ImageButton)findViewById(R.id.im11);
        im12 = (ImageButton)findViewById(R.id.im12);
        im13 = (ImageButton)findViewById(R.id.im13);
        im14 = (ImageButton)findViewById(R.id.im14);
        im15 = (ImageButton)findViewById(R.id.im15);
        im16 = (ImageButton)findViewById(R.id.im16);
        im17 = (ImageButton)findViewById(R.id.im17);
        im18 = (ImageButton)findViewById(R.id.im18);
        im19 = (ImageButton)findViewById(R.id.im19);
        im20 = (ImageButton)findViewById(R.id.im20);
        im21 = (ImageButton)findViewById(R.id.im21);
        im22 = (ImageButton)findViewById(R.id.im22);
        im23 = (ImageButton)findViewById(R.id.im23);
        im24 = (ImageButton)findViewById(R.id.im24);
        im25 = (ImageButton)findViewById(R.id.im25);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im1.setImageResource(R.drawable.circle);
                else
                    im1.setImageResource(R.drawable.x);
                int i=check.input(1);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im2.setImageResource(R.drawable.circle);
                else
                    im2.setImageResource(R.drawable.x);
                int i=check.input(2);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im3.setImageResource(R.drawable.circle);
                else
                    im3.setImageResource(R.drawable.x);
                int i=check.input(3);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im4.setImageResource(R.drawable.circle);
                else
                    im4.setImageResource(R.drawable.x);
                int i=check.input(4);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im5.setImageResource(R.drawable.circle);
                else
                    im5.setImageResource(R.drawable.x);
                int i=check.input(5);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im6.setImageResource(R.drawable.circle);
                else
                    im6.setImageResource(R.drawable.x);
                int i=check.input(6);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im7.setImageResource(R.drawable.circle);
                else
                    im7.setImageResource(R.drawable.x);
                int i=check.input(7);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im8.setImageResource(R.drawable.circle);
                else
                    im8.setImageResource(R.drawable.x);
                int i=check.input(8);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im9.setImageResource(R.drawable.circle);
                else
                    im9.setImageResource(R.drawable.x);
                int i=check.input(9);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im10.setImageResource(R.drawable.circle);
                else
                    im10.setImageResource(R.drawable.x);
                int i=check.input(10);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im11.setImageResource(R.drawable.circle);
                else
                    im11.setImageResource(R.drawable.x);
                int i=check.input(11);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im12.setImageResource(R.drawable.circle);
                else
                    im12.setImageResource(R.drawable.x);
                int i=check.input(12);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im13.setImageResource(R.drawable.circle);
                else
                    im13.setImageResource(R.drawable.x);
                int i=check.input(13);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im14.setImageResource(R.drawable.circle);
                else
                    im14.setImageResource(R.drawable.x);
                int i=check.input(14);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im15.setImageResource(R.drawable.circle);
                else
                    im15.setImageResource(R.drawable.x);
                int i=check.input(15);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im16.setImageResource(R.drawable.circle);
                else
                    im16.setImageResource(R.drawable.x);
                int i=check.input(16);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im17.setImageResource(R.drawable.circle);
                else
                    im17.setImageResource(R.drawable.x);
                int i=check.input(17);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im18.setImageResource(R.drawable.circle);
                else
                    im18.setImageResource(R.drawable.x);
                int i=check.input(18);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im19.setImageResource(R.drawable.circle);
                else
                    im19.setImageResource(R.drawable.x);
                int i=check.input(19);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im20.setImageResource(R.drawable.circle);
                else
                    im20.setImageResource(R.drawable.x);
                int i=check.input(20);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im21.setImageResource(R.drawable.circle);
                else
                    im21.setImageResource(R.drawable.x);
                int i=check.input(21);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im22.setImageResource(R.drawable.circle);
                else
                    im22.setImageResource(R.drawable.x);
                int i=check.input(22);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im23.setImageResource(R.drawable.circle);
                else
                    im23.setImageResource(R.drawable.x);
                int i=check.input(23);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im24.setImageResource(R.drawable.circle);
                else
                    im24.setImageResource(R.drawable.x);
                int i=check.input(24);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
                }
            }
        });
        im25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check.getState()==1)
                    im25.setImageResource(R.drawable.circle);
                else
                    im25.setImageResource(R.drawable.x);
                int i=check.input(25);
                if(i==1) {
                    Dfragment d = new Dfragment();
                    d.show(fm,"");
                }
                else if (i==-1) {
                    finishgame f = new finishgame();
                    f.show(fm,"");
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
class Check{
    int arr[][] = new int[6][6];
    int state;
    int count;
    public Check(){
        state=1;
        count=0;
    }
    public int getState(){
        return state;
    }
    public int input(int i){
        count++;
        i--;
        arr[i/5+1][i%5+1]=state;
        return check();
    }
    public int check(){
        int c=1;//1이 이긴거 0은 아무것도아닌상태 -1은 다했지만 승자가없을때
        for(int i=1;i<6;i++){
            c=1;
            for(int j=1;j<6;j++){
                if(arr[i][j]!=state){
                    c=0;
                }
            }
            if (c==1)return 1;
        }
        for(int i=1;i<6;i++){
            c=1;
            for(int j=1;j<6;j++){
                if(arr[j][i]!=state){
                    c=0;
                }
            }
            if (c==1)return 1;
        }
        c=1;
        for (int i=1;i<6;i++){
            if(arr[i][i]!=state){
                c=0;
            }
        }
        if(c==1)return 1;
        c=1;
        for(int i=1;i<6;i++){
            if(arr[i][6-i]!=state)
                c=0;
        }
        if(c==1)return 1;

        if(state==1)state=-1;
        else state=1;
        if((count==25)&&(c==0))return -1;
        return 0;
    }
}
