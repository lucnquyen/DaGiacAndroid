package com.example.lucnguyen.androiddagiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HinhVuongActivity extends AppCompatActivity {
    Button btnchuvi,btndientich;
    EditText txtcdcanh;
    TextView lblketqua;
    double canhHV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_vuong);
        //
        txtcdcanh=(EditText) findViewById(R.id.txtCanh);
        lblketqua=(TextView) findViewById(R.id.lblKQ);
        //
        btnchuvi=(Button) findViewById(R.id.btnCV);
        btnchuvi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try{
                    canhHV=Double.parseDouble(txtcdcanh.getText().toString());
                    if(canhHV<=0)
                        throw new NhapCanhDuong("Lỗi.Nhập cạnh>0!!!");
                    HinhVuong hv=new HinhVuong(canhHV);
                    lblketqua.setText("Chu vi= "+hv.TinhChuVi()+"");
                }
                catch(NumberFormatException ex){
                    lblketqua.setText("Lỗi. Nhập cạnh là số!!!");
                }
                catch (NhapCanhDuong ex){
                    lblketqua.setText(ex.getMessage());
                }
            }
        });
        //
        btndientich=(Button) findViewById(R.id.btnDT);
        btndientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    canhHV=Double.parseDouble(txtcdcanh.getText().toString());
                    if(canhHV<=0)
                        throw new NhapCanhDuong("Lỗi.Nhập cạnh>0!!!");
                    HinhVuong hv=new HinhVuong(canhHV);
                    lblketqua.setText("Diện tích= "+hv.TInhDienTich()+"");
                }
                catch(NumberFormatException ex){
                    lblketqua.setText("Lỗi. Nhập cạnh là số!!!");
                }
                catch (NhapCanhDuong ex){
                    lblketqua.setText(ex.getMessage());
                }
            }
        });
    }
}
