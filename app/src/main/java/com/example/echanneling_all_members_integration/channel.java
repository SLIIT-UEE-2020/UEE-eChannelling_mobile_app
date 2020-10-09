package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class channel extends AppCompatActivity {

    private Button bookNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);

        bookNow = (Button) findViewById(R.id.btnproceed);

        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnterDetails();
            }
        });
    }

    public void openEnterDetails(){
        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(channel.this, userdetails.class);
                startActivity(intent);
            }
        });
    }
}