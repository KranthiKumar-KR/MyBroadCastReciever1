package com.example.kranthi.mybroadcastreciever;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CustomBroadCast myReceiver;
    IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Intent intent = new Intent();
        intent.setAction("com.example.kranthi.mybroadcastreciever.CustomBroadCast");
        sendBroadcast(intent);*/
        myReceiver = new CustomBroadCast();
    }

    @Override
    protected void onResume() {
      filter = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        registerReceiver(myReceiver, filter);
        super.onResume();
    }

    /*@Override
    protected void onPause() {
        unregisterReceiver(myReceiver,filter);
        super.onPause();
    }*/
}
