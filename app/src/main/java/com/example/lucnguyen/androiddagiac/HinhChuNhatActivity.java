package com.example.lucnguyen.androiddagiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HinhChuNhatActivity extends AppCompatActivity {
    EditText txtcd,txtcr;
    Button btCV,btDT;
    TextView lblKQ;
    double cd,cr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_chu_nhat);
        //
        txtcd=(EditText) findViewById(R.id.txtChieuDai);
        txtcr=(EditText) findViewById(R.id.txtChieuRong);
        btCV=(Button) findViewById(R.id.btnChuVi);
        btDT=(Button) findViewById(R.id.btnDienTich);
        lblKQ=(TextView) findViewById(R.id.lblKetQua);

        // Tinh Chu vi
        btCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    cd=Double.parseDouble(txtcd.getText().toString());
                    if(cd<=0)
                        throw new NhapCanhDuong("Chiều dài>0!!!");
                    cr=Double.parseDouble(txtcr.getText().toString());
                    if(cr<=0)
                        throw new NhapCanhDuong("Chiều rộng>0!!!");
                    HinhChuNhat hcn=new HinhChuNhat(cd,cr);
                    lblKQ.setText("Chu vi= "+hcn.TinhChuVi());
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
                    cd=Double.parseDouble(txtcd.getText().toString());
                    if(cd<=0)
                        throw new NhapCanhDuong("Chiều dài>0!!!");
                    cr=Double.parseDouble(txtcr.getText().toString());
                    if(cr<=0)
                        throw new NhapCanhDuong("Chiều rộng>0!!!");
                    HinhChuNhat hcn=new HinhChuNhat(cd,cr);
                    lblKQ.setText("Diện tích= "+hcn.TInhDienTich());
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
