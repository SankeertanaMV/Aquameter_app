package com.example.sankeerthana.aquameter_app;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private Button login;
    private TextView forgotpassword, register, tv;
    String json_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        forgotpassword = (TextView) findViewById(R.id.forgotpassword);
        register = (TextView) findViewById(R.id.register);
        tv = (TextView)findViewById(R.id.tv);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });


        }

    public void login(View view) {
        String Email = email.getText().toString();
        String Password = password.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,Email,Password);

    }


}


