package com.example.echanneling_all_members_integration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prem_reg extends AppCompatActivity {
    private EditText title, fname, lname, email, nic, dob, mobileNo, password, cpassword;
    private Button rbutton11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prem_reg);

        title = (EditText) findViewById(R.id.editTitleD);
        fname = (EditText) findViewById(R.id.editfirst1D);
        lname = (EditText) findViewById(R.id.editlast1D);
        email = (EditText) findViewById(R.id.editSpecD);
        nic = (EditText) findViewById(R.id.editnic1);
        dob = (EditText) findViewById(R.id.editEmD);
        mobileNo = (EditText) findViewById(R.id.editmobile1);
        password = (EditText) findViewById(R.id.editpass1D);
        cpassword = (EditText) findViewById(R.id.editconfirm1D);
        rbutton11 = (Button) findViewById(R.id.rbutton1);

        rbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLog();
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
    private boolean validateNic(){
        String val=nic.getText().toString();
        if(val.isEmpty()){
            nic.setError("Field cannot be empty");
            return false;
        }else{
            nic.setError(null);
            return true;
        }
    }
    private boolean validateDob(){
        String val=dob.getText().toString();
        if(val.isEmpty()){
            dob.setError("Field cannot be empty");
            return false;
        }else{
            dob.setError(null);
            return true;
        }
    }
    private boolean validateMobNo(){
        String val=mobileNo.getText().toString();
        if(val.isEmpty()){
            mobileNo.setError("Field cannot be empty");
            return false;
        }else{
            mobileNo.setError(null);
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


    public void openLog(){
        rbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!validateTitle() | !validatePassword1() | !validateNic() | !validateMobNo() | !validateLaName() |!validateFname() | !validateDob() | !validateCpassword() | !validateEmail()){
                    return;
                }

                else {
                    Intent intent = new Intent(prem_reg.this , PayementMUser.class);
                    startActivity(intent);
                }


            }
        });
    }
}