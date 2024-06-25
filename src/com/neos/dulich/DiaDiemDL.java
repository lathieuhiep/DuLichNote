package com.neos.dulich;

public class DiaDiemDL {
    private String ma, ten, moTa, diaChi, ghiChu, ngayCheckIn, ngayCheckOut;

    public DiaDiemDL(String ma, String ten, String moTa, String diaChi, String ghiChu, String ngayCheckIn, String ngayCheckOut) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
        this.ngayCheckIn = ngayCheckIn;
        this.ngayCheckOut = ngayCheckOut;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return "Địa điểm du lịch" +
                "Mã địa điểm: " + ma + "\n" +
                "Tên: " + ten + "\n" +
                "Mô tả: " + moTa + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Ghi chú: " + ghiChu + "\n" +
                "Ngày check in: " + ngayCheckIn + "\n" +
                "Ngày check out: " + ngayCheckOut + "\n";
    }
}
