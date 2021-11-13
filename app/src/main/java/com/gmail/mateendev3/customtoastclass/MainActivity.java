package com.gmail.mateendev3.customtoastclass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.click_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyToast.makeMyToast(
                        MainActivity.this,
                        "Hello To My Custom Toast",
                        R.drawable.ic_baseline_emoji_emotions_24,
                        MyToast.LENGTH_LONG).show();
            }
        });
    }
}