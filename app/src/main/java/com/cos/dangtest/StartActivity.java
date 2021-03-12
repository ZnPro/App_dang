package com.cos.dangtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends SplashActivity {

    public void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_start);

    }

    public void mOnClick(View view) {

        Button btn_start = findViewById(R.id.start_btn_set_location);

        btn_start.setOnClickListener(v -> {
            Intent intent = new Intent(StartActivity.this, LocationActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
