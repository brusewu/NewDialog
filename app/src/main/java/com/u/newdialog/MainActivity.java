package com.u.newdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.u.dialoglibrary.SpotsDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(android.R.id.button1).setOnClickListener(this);
        findViewById(android.R.id.button2).setOnClickListener(this);
        findViewById(android.R.id.button3).setOnClickListener(this);
        findViewById(android.R.id.closeButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case android.R.id.button1:
                new SpotsDialog(this).show();
                break;
            case android.R.id.button2:
                new SpotsDialog(this, R.style.Custom).show();
                break;
            case android.R.id.button3:
                new SpotsDialog(this, "Custom message").show();
                break;
            case android.R.id.closeButton:
                new SpotsDialog(this, "Custom message & style", R.style.New).show();
                break;
        }
    }
}
