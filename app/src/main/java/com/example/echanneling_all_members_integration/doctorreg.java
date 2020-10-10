package com.example.echanneling_all_members_integration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class doctorreg extends AppCompatActivity {
    private EditText title,fname,lname,speciality,email,password,cpassword;
    private Button rbuttonD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorreg);


        title = (EditText) findViewById(R.id.editTitleD);
        fname = (EditText) findViewById(R.id.editfirst1D);
        lname = (EditText) findViewById(R.id.editlast1D);
        speciality = (EditText) findViewById(R.id.editSpecD);
        email = (EditText) findViewById(R.id.editEmD);
        password = (EditText) findViewById(R.id.editpass1D);
        cpassword = (EditText) findViewById(R.id.editconfirm1D);
        rbuttonD=(Button)findViewById(R.id.rbutonD);

        rbuttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDocLog1();
            }
        });
    }

    private boolean validateTitle(){
        String val=title.getText().toString();
        if(val.isEmpty()){
            title.setError("Field cannot be empty");
            return false;
        }else{
            title.setError(null);
            return true;
        }
    }

    private boolean validateFname(){
        String val=fname.getText().toString();
        if(val.isEmpty()){
            fname.setError("Field cannot be empty");
            return false;
        }else{
            fname.setError(null);
            return true;
        }
    }
    private boolean validateLaName(){
        String val=lname.getText().toString();
        if(val.isEmpty()){
            lname.setError("Field cannot be empty");
            return false;
        }else{
            lname.setError(null);
            return true;
        }
    }
    private boolean validateEmail(){
        String val=email.getText().toString();
        if(val.isEmpty()){
            email.setError("Field cannot be empty");
            return false;
        }else{
            email.setError(null);
            return true;
        }
    }
    private boolean validateSpeciality(){
        String val=speciality.getText().toString();
        if(val.isEmpty()){
            speciality.setError("Field cannot be empty");
            return false;
        }else{
            speciality.setError(null);
            return true;
        }
    }


    private boolean validatePassword1(){
        String val=password.getText().toString();
        String passwordVal="^" +
                "(?=.*[a-zA-Z])"+
                "(?=.*[@#$%^&])"+
                "(?=\\S+$)"+
                ".{4,}" +
                "$" ;

        if(val.isEmpty()){
            password.setError("Field cannot be empty");
            return false;
        } else if(!val.matches(passwordVal)){
            password.setError("Password is too weak");
            return false;
        }
        else{
            password.setError(null);
            return true;
        }
    }
    private boolean validateCpassword(){
        String val1=cpassword.getText().toString();
        String val2=password.getText().toString();

        if(val1.isEmpty()){
            cpassword.setError("Field cannot be empty");
            return false;
        } else if(!val1.matches(val2)){
            cpassword.setError("Password is not matching");
            return false;
        }
        else{
            cpassword.setError(null);
            return true;
        }
    }


    public void openDocLog1(){
        rbuttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!validateTitle() | !validatePassword1() | !validateEmail() | !validateSpeciality() | !validateLaName() |!validateFname()  | !validateCpassword() | !validateEmail()){
                    return;
                }

                else {
                    Intent intent = new Intent(doctorreg.this , doctorLoginREG.class);
                    startActivity(intent);
                }


            }
        });
    }
}