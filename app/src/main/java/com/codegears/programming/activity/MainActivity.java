package com.codegears.programming.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.codegears.programming.R;

public class MainActivity extends AppCompatActivity {
    private long time = 3000L;
    private Handler handler;
    private Runnable runnable;
    private long delayTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        runnable = new Runnable() {
            public void run() {
                Intent intent = new Intent(MainActivity.this, RecycleViewMainActivity.class);
                startActivity(intent);
                finish();
            }
        };
    }
    public void onResume() {
        super.onResume();
        delayTime = time;
        handler.postDelayed(runnable, delayTime);
        time = System.currentTimeMillis();
    }
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
        time = delayTime - (System.currentTimeMillis() - time);
    }
}
