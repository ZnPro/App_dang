package com.cos.dangtest;

import android.os.Bundle;
import android.view.View;

public class LocationActivity extends StartActivity {
    public void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_location);
    }

    //Button btn_start = findViewById(R.id.start_btn_set_location);

    public void mOnClick(View view) {
        finish();
    }
}
//        btn_start.setOnClickListener(v -> {
//            Intent intent = new Intent(StartActivity.this, LocationActivity.class);
//            startActivity(intent);
//            finish();
//        });
