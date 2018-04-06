package com.example.lucnguyen.androiddagiac;

/**
 * Created by Daonm on 2/3/2018.
 */

public class HinhChuNhat extends LopDaGIac {
    public HinhChuNhat(double cd,double cr) {
        super(2);
        cdCanh[0]=cd;
        cdCanh[1]=cr;
    }
    @Override
    public double TinhChuVi() {
        return (cdCanh[0]+cdCanh[1])*2;
    }

    @Override
    public double TInhDienTich() {
        return cdCanh[0]*cdCanh[1];
    }
}
