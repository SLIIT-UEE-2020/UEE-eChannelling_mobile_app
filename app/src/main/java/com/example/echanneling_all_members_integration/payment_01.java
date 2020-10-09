package com.example.echanneling_all_members_integration.;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.echanneling_all_members_integration.R;

public class payment_01 extends AppCompatActivity {

    private Button btnproceed;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btnproceed = (Button) findViewById(R.id.btnproceed);
        dialog = new Dialog(this);

        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensummaryPay();
            }
        });
    }

    private void opensummaryPay(){
        dialog.setContentView(R.layout.activity_paymentsummarypopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(payment_01.this,"Don't want to pay !",Toast.LENGTH_LONG).show();
            }
        });

        final EditText cnotxt = findViewById(R.id.editTextTextcno);
        final EditText choldertxt =  findViewById(R.id.editTextcholder);
        final EditText exptxt = findViewById(R.id.editTextTextexp);
        final EditText csvtxt = findViewById(R.id.editTextTextcsv);

        final Button btn = dialog.findViewById(R.id.btnsub);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                String cno = "1234567890";
                String cardholder = "Jagath";
                String exp = "01/20";
                String csv = "389";


                if((cno.equals(cnotxt.getText().toString())) && (cardholder.equals(choldertxt.getText().toString())) && (exp.equals(exptxt.getText().toString()) )
                        && (csv.equals(csvtxt.getText().toString()))){
                    Intent intent = new Intent(payment_01.this, schedule.class);
                    startActivity(intent);
                    Toast.makeText(payment_01.this , "Your Payment Successfully !", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(payment_01.this , " Your Payment Unsuccessfully !", Toast.LENGTH_SHORT).show();

                }

            }
        });
        dialog.show();


    }



}