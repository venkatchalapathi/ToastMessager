package com.venkat.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.venkat.toastmessager.ToastMessager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(view -> {
            ToastMessager.showTopLeft(this, "Top Left");
        });
        findViewById(R.id.button5).setOnClickListener(view -> {
            ToastMessager.showTopCenter(this, "Top Center");
        });
        findViewById(R.id.button2).setOnClickListener(view -> {
            ToastMessager.showTopRight(this, "Top Right");
        });
        findViewById(R.id.button3).setOnClickListener(view -> {
            ToastMessager.showCenterLeft(this, "Center Left");
        });
        findViewById(R.id.button6).setOnClickListener(view -> {
            ToastMessager.showCenter(this, "Center");
        });
        findViewById(R.id.button7).setOnClickListener(view -> {
            ToastMessager.showCenterRight(this, "Center Right");
        });
        findViewById(R.id.button4).setOnClickListener(view -> {
            ToastMessager.showBottomLeft(this, "Bottom Left");
        });
        findViewById(R.id.button9).setOnClickListener(view -> {
            ToastMessager.showBottomCenter(this, "Bottom Center");
        });
        findViewById(R.id.button8).setOnClickListener(view -> {
            ToastMessager.showBottomRight(this, "Bottom Right");
        });
    }
}