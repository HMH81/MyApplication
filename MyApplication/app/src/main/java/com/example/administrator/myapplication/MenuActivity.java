package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void onButton1Clicked(View v){
        Toast.makeText(this, "화면이 닫힙니다", Toast.LENGTH_LONG).show(); // 토스트 메세지 시간
        finish();   // 화면을 닫는다
    }
}
