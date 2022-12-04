package com.anand.egreaserforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity {
    Button btnB2C,btnB2B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        btnB2C = findViewById(R.id.btnB2C);
        btnB2B = findViewById(R.id.btnB2B);

        btnB2C.setOnClickListener(view -> {
         startActivity(new Intent(DashBoardActivity.this,MainActivity.class).putExtra("FORM_TYPE",getString(R.string.btoc)));
        });

        btnB2B.setOnClickListener(view -> {
         startActivity(new Intent(DashBoardActivity.this,MainActivity.class).putExtra("FORM_TYPE",getString(R.string.btob)));
        });
    }
}