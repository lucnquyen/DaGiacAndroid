package com.example.lucnguyen.androiddagiac;

/**
 * Created by Daonm on 1/30/2018.
 */

public class HinhVuong extends LopDaGIac {
    public HinhVuong(double dodaicanh) {
        super(1);
        cdCanh[0]=dodaicanh;
    }

    @Override
    public double TinhChuVi() {
        return cdCanh[0]*4;
    }

    @Override
    public double TInhDienTich() {
        return cdCanh[0]*cdCanh[0];
    }
}
