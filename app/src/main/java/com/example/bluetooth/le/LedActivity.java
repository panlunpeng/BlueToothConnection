package com.example.bluetooth.le;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.gongyou.dl.bluetoothconnection.R;

public class LedActivity extends AppCompatActivity {

    Button ledOn;
    Button ledOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);

        ledOn = (Button) findViewById(R.id.led_on);
        ledOff = (Button) findViewById(R.id.led_off);
    }
}
