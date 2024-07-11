package com.hussain.payonclick.Acitivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.android.gms.common.api.Api;
import com.hussain.payonclick.ApiService;
import com.hussain.payonclick.MainActivity;
import com.hussain.payonclick.R;
import com.hussain.payonclick.controller.RetrofitClient;
import com.hussain.payonclick.modelclasses.LoginRequest;
import com.hussain.payonclick.modelclasses.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {
    EditText userid;
    EditText userpassword;
    Button login;
    TextView signUp;
    TextView tv;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

//----------------find the id-----------------------------------
        userid = findViewById(R.id.userid);
        userpassword=findViewById(R.id.userpassword);
        login = findViewById(R.id.login_button);
        signUp = findViewById(R.id.signUp);
        tv = findViewById(R.id.tv);








//-----------------------------clikon lister----------------------------

    //for the loginApi
        //agruser exit krke dowara open krega app tb usse logout krana hai


    //redirect to to singup
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userid.getText().toString().trim();
                String password = userpassword.getText().toString().trim();
                String tokenKey = "1234"; // Adjust this as needed
                String deviceInfo = "1234"; // Adjust this as needed

                if (!username.isEmpty() && !password.isEmpty()) {
                    loginUser(username, password, tokenKey, deviceInfo);
                } else {
                    Toast.makeText(login.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void loginUser(String username, String password, String tokenKey, String deviceInfo) {
      ApiService apiService = RetrofitClient.getClient("http://api.payonclick.in/").create(ApiService.class);
        LoginRequest loginRequest = new LoginRequest(username, password, tokenKey, deviceInfo);

        Call<LoginResponse> call = apiService.userLogin(loginRequest);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    LoginResponse loginResponse = response.body();
                    if (loginResponse.getStatuscode().equals("TXN")) {

                        String name = loginResponse.getData().getName();
                        String mobileNo = loginResponse.getData().getMobileNo();
                        String emailID = loginResponse.getData().getEmailID();
                        String aadharno = loginResponse.getData().getAadharNo();

                        Log.d("Login Success", "Name: " + name);
                        Log.d("Login Success", "Mobile Number: " + mobileNo);
                        Log.d("Login Success", "Email ID: " + emailID);
                        Log.d("Login Success", "aadharNo" + aadharno);

                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(login.this, loginResponse.getStatus(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(login.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.e("Login Error", t.getMessage());
                Toast.makeText(login.this, "An error occurred", Toast.LENGTH_SHORT).show();
            }
        });
    }
}