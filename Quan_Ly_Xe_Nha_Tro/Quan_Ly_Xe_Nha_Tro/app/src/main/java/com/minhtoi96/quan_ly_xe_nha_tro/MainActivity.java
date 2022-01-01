package com.minhtoi96.quan_ly_xe_nha_tro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// main chính
public class MainActivity extends AppCompatActivity {
    //khai báo các button
    Button btnquet;
    Button btnds;
    Button btnthoat;
    Button btnnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ánh xạ và gáng lệnh thực thi
        
        // chuyển qa main quét
        btnquet = (Button) findViewById(R.id.btnquet);
        btnquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, quet.class);
                startActivity(intent);
            }
        });
        // chuyển qa main danh sách
        btnds = (Button) findViewById(R.id.btnds);
        btnds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
        // chuyển qa main nhập
        btnnhap = (Button) findViewById(R.id.btnnhap);
        btnnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tra.class);
                startActivity(intent);
            }
        });
        // thoát
        btnthoat = (Button) findViewById(R.id.btnthoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
