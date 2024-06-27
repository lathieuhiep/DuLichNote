package com.neos.dulich;

import java.time.LocalDate;

public class DiaDiemDL {
    private String ma, ten, moTa, diaChi, ghiChu;
    private LocalDate ngayCheckIn, ngayCheckOut;

    public DiaDiemDL(String ma, String ten, String moTa, String diaChi, String ghiChu) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }

    public void setNgayCheckIn(LocalDate ngayCheckIn) {
        this.ngayCheckIn = ngayCheckIn;
    }

    public void setNgayCheckOut(LocalDate ngayCheckOut) {
        this.ngayCheckOut = ngayCheckOut;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public LocalDate getNgayCheckIn() {
        return ngayCheckIn;
    }

    public LocalDate getNgayCheckOut() {
        return ngayCheckOut;
    }

    @Override
    public String toString() {
        return "Địa điểm du lịch\n" +
                "Mã địa điểm: " + ma + "\n" +
                "Tên: " + ten + "\n" +
                "Mô tả: " + moTa + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Ghi chú: " + ghiChu + "\n" +
                "Ngày check in: " + ngayCheckIn + "\n" +
                "Ngày check out: " + ngayCheckOut + "\n";
    }
}
