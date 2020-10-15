package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.strlibrary.StrUtils;
import com.example.toastlibrary.ToastUtils;


public class MainActivity extends AppCompatActivity {

    private Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // ToastUtils.getInstance(getApplicationContext()).showToast(StrUtils.getInstance(getApplicationContext()).getStr());
            }
        });
}
}
