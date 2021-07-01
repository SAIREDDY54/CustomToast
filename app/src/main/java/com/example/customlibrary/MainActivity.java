package com.example.customlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customtoast.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.CustomToast(getApplication(), "Hello World!");
    }
}