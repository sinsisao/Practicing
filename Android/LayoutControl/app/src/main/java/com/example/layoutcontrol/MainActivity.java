package com.example.layoutcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context mContext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        {
            setContentView(R.layout.activity_main);
        }
        {
            setContentView(R.layout.inflation);
        }
        {
            LinearLayout ll = new LinearLayout(mContext);
            ll.setVisibility(View.VISIBLE);
            ll.setOrientation(LinearLayout.VERTICAL);
            ll.setBackgroundColor(0xffcccccc);

            TextView tv = new TextView(mContext);
            tv.setText("TextView");
            tv.setTextColor(0xff0000ff);
            tv.setTextSize(30);
            tv.setGravity(Gravity.CENTER);

            ll.addView(tv);
            setContentView(ll);
        }
        {
            LayoutInflater li = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LinearLayout ll = (LinearLayout)li.inflate(R.layout.inflation, null);
            setContentView(ll);
        }
        {
            LayoutInflater li1 = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutInflater li2 = LayoutInflater.from(mContext);
            LinearLayout ll1 = (LinearLayout)li1.inflate(R.layout.inflation, null);
            LinearLayout ll2 = (LinearLayout)li2.inflate(R.layout.inflation, null);
            LinearLayout ll3 = (LinearLayout)View.inflate(mContext, R.layout.inflation, null);
        }
        {
            LayoutInflater li1 = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LinearLayout ll = (LinearLayout)li1.inflate(R.layout.inflation, null);
            LayoutInflater li2 = LayoutInflater.from(mContext);
            li2.inflate(R.layout.mytextview, ll);
            View.inflate(mContext, R.layout.mytextview, ll);
            setContentView(ll);
        }
//        <TextView
//        a:layout_width="match_parent"
//        a:layout_height="wrap_content"
//        a:gravity="center"
//        a:textColor="#ff0000"
//        a:textSize="20sp"
//        a:text="TextView"
//                />
    }
}
