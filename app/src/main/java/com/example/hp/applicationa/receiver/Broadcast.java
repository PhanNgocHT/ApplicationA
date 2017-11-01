package com.example.hp.applicationa.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.hp.applicationa.activity.MainActivity;

/**
 * Created by hp on 11/1/2017.
 */

public class Broadcast extends BroadcastReceiver {
    public static String KEY_MESSAGE_A="message_a";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getStringExtra(KEY_MESSAGE_A), Toast.LENGTH_LONG).show();
        intent=new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
