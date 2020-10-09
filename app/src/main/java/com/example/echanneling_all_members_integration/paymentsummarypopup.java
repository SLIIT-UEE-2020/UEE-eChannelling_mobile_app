package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class paymentsummarypopup extends AppCompatActivity {

    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentsummarypopup);

        btn = (Button) findViewById(R.id.btnsub);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfinalWindow();
            }
        });

    }

    public void openfinalWindow(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsummarypopup.this, schedule.class);
                startActivity(intent);
            }
        });
    }
}
