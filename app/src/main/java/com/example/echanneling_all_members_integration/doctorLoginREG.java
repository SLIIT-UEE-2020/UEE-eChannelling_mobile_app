package com.example.echanneling_all_members_integration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class doctorLoginREG extends AppCompatActivity {
    private Button btnplogin;
    private EditText mobiletxt, passwordtxt;
    private Button rDregBTN;
    private Button patientbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login_r_e_g);


        btnplogin = (Button) findViewById(R.id.btnLog1);
        mobiletxt = (EditText) findViewById(R.id.pmobile1);
        passwordtxt = (EditText) findViewById(R.id.ppass1);
        rDregBTN = (Button) findViewById(R.id.btnRegDD);
        patientbtn=(Button)findViewById(R.id.btnPatientDoc1) ;

        btnplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpatient();
            }
        });

        rDregBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDocReg();
            }
        });

        patientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientLog();
            }
        });



    }

    private boolean validatePhoneNo() {
        String val = mobiletxt.getText().toString();
        if (val.isEmpty()) {
            mobiletxt.setError("Field cannot be empty");
            return false;
        } else {
            mobiletxt.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String val = passwordtxt.getText().toString();
        String passwordVal = "^" +
                "(?=.*[a-zA-Z])" +
                "(?=.*[@#$%^&])" +
                "(?=\\S+$)" +
                ".{4,}" +
                "$";

        if (val.isEmpty()) {
            passwordtxt.setError("Field cannot be empty");
            return false;
        } else if (!val.matches(passwordVal)) {
            passwordtxt.setError("Password is too weak");
            return false;
        } else {
            passwordtxt.setError(null);
            return true;
        }
    }

    public void openpatient() {
        btnplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobile = "0710525884";
                String password = "Hansi123@";

                if (!validatePhoneNo() | !validatePassword()) {
                    return;
                } else if ((mobile.equals(mobiletxt.getText().toString())) && (password.equals(passwordtxt.getText().toString()))) {
                    Intent intent = new Intent(doctorLoginREG.this, com.example.echanneling_all_members_integration.doctorMain.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(doctorLoginREG.this, "UserName or Password incorrect", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    public void openDocReg() {
        rDregBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(doctorLoginREG.this, doctorLoginREG.class);
                startActivity(intent);
            }
        });
    }

    public void openPatientLog() {
        patientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(doctorLoginREG.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}