package com.example.tugas3indahwulandari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickMasjid(View view) {
        //gambar Mesjid di click
        Intent i = new Intent(this,Mesjid.class);
        startActivity(i);
    }
}