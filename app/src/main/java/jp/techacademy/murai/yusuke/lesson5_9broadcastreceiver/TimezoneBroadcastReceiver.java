package jp.techacademy.murai.yusuke.lesson5_9broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by my99workmac on 2017/01/08.
 */

public class TimezoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "タイムゾーンが変化しました!!", Toast.LENGTH_LONG).show();
    }
}
