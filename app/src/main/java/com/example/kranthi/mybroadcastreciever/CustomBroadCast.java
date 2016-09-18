package com.example.kranthi.mybroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kranthi on 9/17/2016.
 */
public class CustomBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            switch (state) {
                case 0:
                    Toast.makeText(context,"headset is Unpluged ",Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    Toast.makeText(context,"headset pluged in",Toast.LENGTH_LONG).show();
                    break;
                default:
                    Log.d("headset status", "I have no idea what the headset state is");
            }
        }
        /*Toast.makeText(context,"headset pluged in",Toast.LENGTH_LONG).show();
        Log.i("board cast","headset plugged in");*/
    }
}
