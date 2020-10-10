package com.example.echanneling_all_members_integration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class Payment extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        imageView = (ImageView) findViewById(R.id.imgvisa);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, com.example.echanneling_all_members_integration.Purchase.class);
                startActivity(intent);
            }
        });

        imageView1 = (ImageView) findViewById(R.id.imgmastercard);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, com.example.echanneling_all_members_integration.Purchase2.class);
                startActivity(intent);
            }
        });

        imageView2 = (ImageView) findViewById(R.id.imgamerican);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, com.example.echanneling_all_members_integration.Purchase3.class);
                startActivity(intent);
            }
        });

        imageView3 = (ImageView) findViewById(R.id.imgpaypal);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, com.example.echanneling_all_members_integration.Purchase4.class);
                startActivity(intent);
            }
        });

        imgback = (ImageView) findViewById(R.id.imageView);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this,MedLab.class);
                startActivity(intent);
            }
        });
    }
}
