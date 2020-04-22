package com.ade.testkedua.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ade.testkedua.R;
import com.eqot.fontawesome.FontAwesome;

public class Tugas4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_library);
        FontAwesome.applyToAllViews(this, findViewById(R.id.activity_main));
    }
}
