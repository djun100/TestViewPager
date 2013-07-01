package com.example.testviewpager;

import java.util.ArrayList;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoAdapter extends PagerAdapter {

  private ArrayList<String> list;
  private LayoutInflater inflater;

  public DemoAdapter(Context context, ArrayList<String> list) {
    this.list = list;
    inflater = LayoutInflater.from(context);
  }

  @Override
  public void destroyItem(ViewGroup container, int position, Object object) {
    ((ViewPager) container).removeView((View) object);
  }

  @Override
  public void finishUpdate(View container) {}

  @Override
  public int getCount() {
    return list != null ? list.size() : 0;
  }

  @Override
  public Object instantiateItem(ViewGroup view, int position) {

    String userName = list.get(position);

    // 自定义的view
    View userLayout = inflater.inflate(R.layout.show_user_detail, view, false);
    TextView tvName = (TextView) userLayout.findViewById(R.id.tv_username);

    // 填充数据
    tvName.setText(userName);

    ((ViewPager) view).addView(userLayout, 0);
    return userLayout;
  }

  @Override
  public boolean isViewFromObject(View view, Object object) {
    return view.equals(object);
  }

  @Override
  public void restoreState(Parcelable state, ClassLoader loader) {}

  @Override
  public Parcelable saveState() {
    return null;
  }

  @Override
  public void startUpdate(View container) {}
}
