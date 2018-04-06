package com.example.lucnguyen.androiddagiac;


public class HinhTamGiac extends LopDaGIac {
    public HinhTamGiac(double canhA, double canhB, double canhC) {
        super(3);
        cdCanh[0] = canhA;
        cdCanh[1] = canhB;
        cdCanh[2] = canhC;
    }
    @Override
    public double TinhChuVi() {
        return (cdCanh[0]+cdCanh[1]+cdCanh[2]);
    }
    @Override
    public double TInhDienTich()
    {
        double p=(float)(cdCanh[0]+cdCanh[1]+cdCanh[2])/2;
        float sd;
        sd = (float)Math.sqrt(p*(p-cdCanh[0])*(p-cdCanh[1])*(p-cdCanh[2]));
        return sd;
    }

}