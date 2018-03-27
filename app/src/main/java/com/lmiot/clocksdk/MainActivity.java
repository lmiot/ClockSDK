package com.lmiot.clocksdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loonggg.lib.alarmmanager.clock.AlarmManagerUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  AlarmManagerUtil. setAlarm(this, 1, 18, 56, 12, 0, "闹钟提醒", 2);
        AlarmManagerUtil. setAlarm(this, 1, 18, 57, 12, 0, "闹钟提醒", 2);
*/
    }
}
