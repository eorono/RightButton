package com.example.eleazar.rightbutton;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.MyService;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonOn).setOnClickListener(mClickListener);
        findViewById(R.id.buttonOff).setOnClickListener(mClickListener);
    }

    View.OnClickListener mClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.buttonOn:
                    // Start Service
                    startService(new Intent(MainActivity.this, MyService.class));
                    break;
                case R.id.buttonOff:
                    // Stop Service
                    stopService(new Intent(MainActivity.this, MyService.class));
                    break;
            }
        }
    };
}
