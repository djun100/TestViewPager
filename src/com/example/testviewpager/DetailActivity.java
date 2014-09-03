package com.example.testviewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class DetailActivity extends Activity {

    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        ArrayList<String> userList = getIntent().getStringArrayListExtra("data");
        int intoPostion = getIntent().getIntExtra("intoPosition", 0);

        setContentView(R.layout.activity_detail);
        vp = (ViewPager) findViewById(R.id.pager);

        DemoAdapter adapter = new DemoAdapter(this, userList);
        vp.setAdapter(adapter);
        vp.setCurrentItem(intoPostion);

        vp.postDelayed(new Runnable() {

            @Override
            public void run() {
                vp.setCurrentItem(0, false);
            }
        }, 3000);
        vp.postDelayed(new Runnable() {

            @Override
            public void run() {
                vp.setCurrentItem(7, true);
            }
        }, 6000);

    }

}
