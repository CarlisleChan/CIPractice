package com.carlisle.cipractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String ACCOUNT = "android";
    public static final String PASSWD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loginResultView = (TextView) findViewById(R.id.tv_login_result);

        String name = getIntent().getStringExtra("account");
        String pwd = getIntent().getStringExtra("passwd");

        if (ACCOUNT.equals(name) && PASSWD.equals(pwd)) {
            loginResultView.setText("登录成功");
        } else {
            loginResultView.setText("登录失败");
        }
    }
}
