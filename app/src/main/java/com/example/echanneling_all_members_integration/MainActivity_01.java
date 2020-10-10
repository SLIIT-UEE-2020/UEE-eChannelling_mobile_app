package com.example.echanneling_all_members_integration;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity_01 extends AppCompatActivity {

    private Button btn1 , btn2, btn3 , btn4 , btn5 , btn6 , btn7 , btn8 ;
    Dialog dialog;
    DatePickerDialog dpd;
    Calendar calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_01);


        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.btnproceed);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);

        dialog = new Dialog(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectpopup();
            }
        });

    }


    private void openSelectpopup(){
        dialog.setContentView(R.layout.activity_doctorpopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(MainActivity_01.this,"Not Available",Toast.LENGTH_LONG).show();
            }
        });

        final EditText doctortxt = dialog.findViewById(R.id.DoctorName);
        final EditText hospitaltxt =  dialog.findViewById(R.id.HospitalName);
        final EditText datetxt = dialog.findViewById(R.id.editTextDate);

        final Button btnSearch = dialog.findViewById(R.id.btnsub);
        final Button btncal = dialog.findViewById(R.id.cal);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calender   = Calendar.getInstance();
                int day = calender.get(Calendar.DAY_OF_MONTH);
                int month = calender.get(Calendar.MONTH);
                int year = calender.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity_01.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mDay, int mMonth, int mYear) {
                        datetxt.setText(mDay + "/"+ (mMonth + 1) + "/" + (mYear));
                    }
                },day,month,year);
                dpd.show();
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                String doctor = "Jagath";
                String hospital = "Hemas";
                String date = "2020/1/5";

               // System.out.println("date ------------------------ "+date);
                //System.out.println("text date ------------------------ "+datetxt.getText());

                if((doctor.equals(doctortxt.getText().toString())) && (hospital.equals(hospitaltxt.getText().toString())) && (date.equals(datetxt.getText().toString()))){
                    Intent intent = new Intent(MainActivity_01.this, com.example.category.channel.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity_01.this , "Searching your consultant", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity_01.this , "Not Available your consultant", Toast.LENGTH_SHORT).show();

                }

            }
        });
        dialog.show();

    }


    private class Calender {
    }
}