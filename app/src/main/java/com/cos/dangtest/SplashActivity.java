package com.cos.dangtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void mOnClick(View view) {
        Intent intent = new Intent(SplashActivity.this, StartActivity.class);
        startActivity(intent);
        finish();
    }

//     new Thread(new Runnable() {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(1500);
//                Intent intent = new Intent(SplashActivity.this, StartActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                startActivity(intent);
//                SplashActivity.this.finish();
//                Log.d(TAG, "run: 실행됨");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }).start();

}
