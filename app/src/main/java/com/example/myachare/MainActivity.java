package com.example.myachare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private LoginData loginData = new LoginData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_text);
        textView = findViewById(R.id.tv_text);

        findViewById(R.id.btn_put).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginData.phone = editText.getText().toString().trim();
                AppDiskCache.setLogin(loginData);
            }
        });
        findViewById(R.id.btn_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppDiskCache.getLogin() != null) {
                    loginData = AppDiskCache.getLogin();
                    textView.setText(loginData.phone);
                }
            }
        });
    }
}
