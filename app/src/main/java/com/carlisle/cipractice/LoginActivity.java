package com.carlisle.cipractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by carlisle on 02/03/2017.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText accountView;
    private EditText passwdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        accountView = (EditText) findViewById(R.id.et_account);
        passwdView = (EditText) findViewById(R.id.et_passwd);
    }

    public void onLoginClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("account", accountView.getText().toString().trim());
        intent.putExtra("passwd", passwdView.getText().toString().trim());
        startActivity(intent);
    }
}
