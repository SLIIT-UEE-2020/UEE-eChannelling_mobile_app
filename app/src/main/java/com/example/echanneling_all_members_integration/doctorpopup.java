package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class doctorpopup extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);

        Button btn = (Button) findViewById(R.id.btnsub);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSchedule();
            }
        });

    }

    public void openSchedule() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(doctorpopup.this, channel.class);
                startActivity(intent);
                Toast.makeText(doctorpopup.this, "Searching your consultant", Toast.LENGTH_SHORT).show();
            }
        });
    }

}