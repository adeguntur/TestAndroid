package com.ade.testkedua.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ade.testkedua.R;
import com.ade.testkedua.api.RetrofitClient;
import com.ade.testkedua.db.SharedPrefManager;
import com.ade.testkedua.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText edtEmail,edtPassword;

    Button btnLogin;
    ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = (EditText)findViewById(R.id.edtEMail);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        btnLogin = (Button)findViewById(R.id.btnMasuk);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });

        initDialog();
    }

    private void userLogin() {

        showpDialog();

        String ClientId = "d067c583cba8b583a185000a980e3627";
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        Call<LoginResponse> call = RetrofitClient
                .getInstance().getApi().userLogin(ClientId, email,password);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                LoginResponse loginResponse = response.body();

                    SharedPrefManager.getInstance(LoginActivity.this)
                            .saveUser(loginResponse.getAccessToken());

                    Intent intent = new Intent(LoginActivity.this, ListProductActivity.class);
                    startActivity(intent);

                    hidepDialog();



            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }

    protected void initDialog() {

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.setCancelable(true);
    }


    protected void showpDialog() {

        if (!pDialog.isShowing()) pDialog.show();
    }

    protected void hidepDialog() {

        if (pDialog.isShowing()) pDialog.dismiss();
    }

}
