package com.example.lucnguyen.androiddagiac;

/**
 * Created by Daonm on 1/30/2018.
 */

public abstract class LopDaGIac {
    // member variables
    private int socanh;
    protected  double [] cdCanh;
    // constructor
    public  LopDaGIac(int socanh){
        this.socanh=socanh;
        cdCanh=new double[socanh];
    }
    // abstract methods
    public  abstract double TinhChuVi();
    public  abstract double TInhDienTich();
}
