package com.example.testviewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

  ArrayList<String> userList;
  private ListView listView; 
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    userList = new ArrayList<String>();
    
    //初始化一百个userName
    for (int i = 1; i <= 100; i++) {
     userList.add("userName"+i);
    }
    
    listView = (ListView) findViewById(R.id.lv_user);
    
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userList);
    listView.setAdapter(adapter);
    adapter.notifyDataSetChanged();
    
    listView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        intent.putStringArrayListExtra("data", userList);
        intent.putExtra("intoPosition", position);
        startActivity(intent);
      }
    });
    
    
  }



}
