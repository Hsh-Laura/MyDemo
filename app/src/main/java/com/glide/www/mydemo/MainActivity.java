package com.glide.www.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //弹出
        Toast.makeText(this, "22222222222222222", Toast.LENGTH_SHORT).show();
    }
}
