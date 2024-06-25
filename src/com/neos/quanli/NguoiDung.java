package com.neos.quanli;

import com.neos.dulich.DiaDiemDL;
import com.neos.dulich.QuanNgon;

import java.util.ArrayList;

public class NguoiDung {
    private ArrayList<DiaDiemDL> listDiaDiemDL;
    private ArrayList<QuanNgon> listQuanNgon;

    public NguoiDung() {
        listDiaDiemDL = new ArrayList<DiaDiemDL>();
        listQuanNgon = new ArrayList<QuanNgon>();
    }

    void themDDDL(DiaDiemDL gTriDDDL) {
        // nhập thông tin địa điêm du lịch để thêm vào dsDDDL[]
    }

    void xoaDDDL(String gTriMaDDDL) {
        // tìm trong dsDDDL[] nếu DiaDiemDL->ma = gTriMaDDDL thi xóa khỏi danh sách
    }

    void themQN(QuanNgon gTriQuanNgon) {
        // nhập thông tin quán ngon để thêm vào dsQuanNgon[]
    }

    void xoaQN(String gTriMaQN) {
        // tìm trong dsQuanNgon nếu QuanNgon->maQN = gTriMaQN thi xóa khỏi danh sách
    }

    QuanNgon timKiemQN(String gTriMaDDDL) {
        QuanNgon dsKQQN = null;

        // tìm trong dsQuanNgon nếu QuanNgon->maDDDL = gTriMaDDDL thì thêm vào dsKQQN

        return dsKQQN;
    }

    void sapXepQuanNgon(String gTriMaDDDL) {
        QuanNgon dsSXQN = null;

        // tìm trong dsQuanNgon theo điều kiện QuanNgon->maDDDL = gTriMaDDDL
        // thi luu vao dsSXQN
        // Sắp xếp theo QuanNgon->khoangCach từ gần đến xa trong dsSXQN
        // Duyet tung QuanNgon trong dsSXQN, QuanNgon->inTT()
    }

    void hienThiDDDLDaDiQua() {
        // in ra thông địa điểm du lịch đã đi qua theo điều kiện DiaDiemDL->ngayCheckOut không null
    }

    void inDSQuanNgon() {
        // Duyet tung QuanNgon trong dsQN, QuanNgon->inTT()
    }
}
