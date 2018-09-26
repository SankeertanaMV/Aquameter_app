package com.example.sankeerthana.aquameter_app;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class RegisterActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password, et_flatno, et_address;
    Button et_register;
    String name,email,password,flatno,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_name = (EditText)findViewById(R.id.et_name);
        et_email = (EditText)findViewById(R.id.et_email);
        et_password = (EditText)findViewById(R.id.et_password);
        et_flatno = (EditText)findViewById(R.id.et_flatno);
        et_address = (EditText)findViewById(R.id.et_address);
        et_register = (Button)findViewById(R.id.et_register);
    }

    public void register(View view) {

        name = et_name.getText().toString();
        email = et_email.getText().toString();
        password = et_password.getText().toString();
        flatno = et_flatno.getText().toString();
        address = et_address.getText().toString();

        BackgroundTask backgroundTask = new BackgroundTask();
        backgroundTask.execute(name,email,password,flatno,address);
        finish();
    }

    class BackgroundTask extends AsyncTask<String,Void,String> {


        String register_url;
        @Override
        protected void onPreExecute() {
            register_url = "https://aquameter.000webhostapp.com/add_info.php";
        }

        @Override
        protected String doInBackground(String... args) {
            String name,email,password,flatno,address;
            name = args[0];
            email = args[1];
            password = args[2];
            flatno = args[3];
            address = args[4];

            try {
                URL url = new URL(register_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data_string = URLEncoder.encode("name","UTF-8")+"="+URLEncoder.encode(name,"UTF-8")+"&"+
                        URLEncoder.encode("email","UTF-8")+"="+URLEncoder.encode(email,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8")+"&"+
                        URLEncoder.encode("flatno","UTF-8")+"="+URLEncoder.encode(flatno,"UTF-8")+"&"+
                        URLEncoder.encode("address","UTF-8")+"="+URLEncoder.encode(address,"UTF-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.close();
                httpURLConnection.disconnect();
                return "One row of Data inserted..";


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }


        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
        }


    }
}
