package com.example.lucnguyen.androiddagiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        bt1=(Button) findViewById(R.id.btnHinhVuong);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itHV=
                        new Intent(MainActivity.this,
                                HinhVuongActivity.class);
                startActivity(itHV);
            }
        });
        //
        bt2=(Button) findViewById(R.id.btHinhChuNhat);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itHCN=
                        new Intent(MainActivity.this,
                                HinhChuNhatActivity.class);
                startActivity(itHCN);
            }
        });

        bt3=(Button) findViewById(R.id.btHinhTamGIac);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itHTG=
                        new Intent(MainActivity.this,
                                HinhTamGiacActivity.class);
                startActivity(itHTG);
            }
        });

    }

}
