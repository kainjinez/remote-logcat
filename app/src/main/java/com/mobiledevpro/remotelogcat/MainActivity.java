package com.mobiledevpro.remotelogcat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_send_debug).setOnClickListener(view -> {
            RemoteLog.d("Test", "Some debug info");
        });

        findViewById(R.id.btn_send_error).setOnClickListener(view -> {
            RemoteLog.e("Test", "Some error info");
        });
    }
}
