package com.minhtoi96.quan_ly_xe_nha_tro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// main tra

public class Tra extends AppCompatActivity {

    // khai báo

    private EditText bs;
    Button btntra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tra);
        this.bs = (EditText)this.findViewById(R.id.editnhap);
        btntra = (Button) findViewById(R.id.btntra);
        // lấy text từ editText đê tra và đưa qua main kết quả
        btntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bso = bs.getText().toString();
                int lengh = bso.length();
                if (lengh == 9) {
                    Intent intent = new Intent(Tra.this, Main5Activity.class);
                    intent.putExtra("BS", bso);
                    startActivity(intent);
                }else if (lengh == 11){
                    Intent intent = new Intent(Tra.this, Main5Activity.class);
                    intent.putExtra("BS", bso);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Tra.this, "Lỗi nhập biển số",Toast.LENGTH_LONG).show();
                }
            }
        });

            }

    }

