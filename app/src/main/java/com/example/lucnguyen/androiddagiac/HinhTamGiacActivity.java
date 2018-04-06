package com.example.lucnguyen.androiddagiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
class HinhTamGiacActivity extends AppCompatActivity {
    EditText txtcanhA, txtcanhB, txtcanhC;
    Button btCV, btDT;
    TextView lblKQ;
    double canhA,canhB,canhC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_tam_giac);
        //
        txtcanhA=(EditText) findViewById(R.id.txtCanha);
        txtcanhB=(EditText) findViewById(R.id.txtCanhb);
        txtcanhC=(EditText) findViewById(R.id.txtCanhc);
        btCV=(Button) findViewById(R.id.btnChuVi);
        btDT=(Button) findViewById(R.id.btnDienTich);
        lblKQ=(TextView) findViewById(R.id.lblKetQua);

        // Tinh Chu vi
        btCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    canhA=Double.parseDouble(txtcanhA.getText().toString());
                    if(canhA<=0)
                        throw new NhapCanhDuong("Cạnh A>0!!!");
                    canhB=Double.parseDouble(txtcanhB.getText().toString());
                    if(canhB<=0)
                        throw new NhapCanhDuong("CanhB>0!!!");
                    canhC=Double.parseDouble(txtcanhC.getText().toString());
                    if(canhC<=0)
                        throw new NhapCanhDuong("CanhC>0!!!");
                    HinhTamGiac htg =new HinhTamGiac(canhA, canhB, canhC);
                    lblKQ.setText("Chu vi= "+htg.TinhChuVi());
                }
                catch (NumberFormatException ex){
                    lblKQ.setText("Nhập các canh là số!!!");
                }
                catch (NhapCanhDuong ex2){
                    lblKQ.setText(ex2.getMessage());
                }
            }
        });
        // Tinh Dien Tich
        btDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    canhA=Double.parseDouble(txtcanhA.getText().toString());
                    if(canhA<=0)
                        throw new NhapCanhDuong("Cạnh A>0!!!");
                    canhB=Double.parseDouble(txtcanhB.getText().toString());
                    if(canhB<=0)
                        throw new NhapCanhDuong("CanhB>0!!!");
                    canhC=Double.parseDouble(txtcanhC.getText().toString());
                    if(canhC<=0)
                        throw new NhapCanhDuong("CanhC>0!!!");
                    HinhTamGiac htg =new HinhTamGiac(canhA, canhB, canhC);
                    lblKQ.setText("Diện tích= "+htg.TInhDienTich());
                }
                catch (NumberFormatException ex){
                    lblKQ.setText("Nhập các canh là số!!!");
                }
                catch (NhapCanhDuong ex2){
                    lblKQ.setText(ex2.getMessage());
                }
            }
        });
    }

}