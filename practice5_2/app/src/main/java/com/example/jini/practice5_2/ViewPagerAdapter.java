package com.example.jini.practice5_2;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jini on 2015-10-12.
 */
public class ViewPagerAdapter extends PagerAdapter {
    int size;
    Activity act;
    View  layout;
    TextView pagenumber;
    Button click;
    public ViewPagerAdapter(MainActivity mainActivity, int noofsize){
        act = mainActivity;
        size = noofsize;
    }
    @Override
    public int getCount() {
        return size;
    }

    public Object instantiateItem(View  container, int position){
        LayoutInflater inflater = (LayoutInflater)act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layout = inflater.inflate(R.layout.pages,null);
        pagenumber = (TextView)layout.findViewById(R.id.pagenumber);
        int pagenumberTxt=position+1;
        pagenumber.setText("Now your in Page No" + pagenumberTxt);
        ((ViewPager)container).addView(layout,0);
        return layout;
    }
    public void destroyItem(View arg0, int arg1,Object arg2){
        ((ViewPager)arg0).removeView((View)arg2);

    }
    public Parcelable saveState(){
        return null;
    }
    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view==((View)o);
    }
}
