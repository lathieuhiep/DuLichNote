package com.neos.dulich;

public class QuanNgon {
    private String maDDDL, maQN, ten, diaChi, moTa, dacSan;
    private double khoangCach;

    public QuanNgon(String maDDDL, String maQN, String ten, String diaChi, String moTa, String dacSan, double khoangCach) {
        this.maDDDL = maDDDL;
        this.maQN = maQN;
        this.ten = ten;
        this.diaChi = diaChi;
        this.moTa = moTa;
        this.dacSan = dacSan;
        this.khoangCach = khoangCach;
    }

    public String getMaDDDL() {
        return maDDDL;
    }

    public String getMaQN() {
        return maQN;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getKhoangCach() {
        return khoangCach;
    }
}
