package com.neos.quanli;

import com.neos.dulich.DiaDiemDL;
import com.neos.dulich.QuanNgon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class NguoiDung {
    private ArrayList<DiaDiemDL> danhSachDiaDiem;
    private ArrayList<QuanNgon> danhSachQuanNgon;

    public NguoiDung() {
        danhSachDiaDiem = new ArrayList<DiaDiemDL>();
        danhSachQuanNgon = new ArrayList<QuanNgon>();
    }

    public void themDiaDiem(DiaDiemDL diaDiem) {
        danhSachDiaDiem.add(diaDiem);
    }

    public void xoaDiaDiem(String maDiaDiem) {
        for (int i = 0; i < danhSachDiaDiem.size(); i++) {
            DiaDiemDL diaDiemDL = danhSachDiaDiem.get(i);

            if ( diaDiemDL.getMa().equals(maDiaDiem) ) {
                danhSachDiaDiem.remove(diaDiemDL);
            }
        }
    }

    public void themQuanNgon(QuanNgon quanNgon) {
        danhSachQuanNgon.add(quanNgon);
    }

    public void xoaQuanNgon(String maQuan) {
        for (int i = 0; i < danhSachQuanNgon.size(); i++) {
            QuanNgon quanNgon = danhSachQuanNgon.get(i);

            if (quanNgon.getMaQN().equals(maQuan)) {
                danhSachQuanNgon.remove(quanNgon);
            }
        }
    }

    public ArrayList<DiaDiemDL> hienThiDiaDiemDaDiQua() {
        ArrayList<DiaDiemDL> diaDiemDaDiQua = new ArrayList<DiaDiemDL>();

        for (int i = 0; i < danhSachDiaDiem.size(); i++) {
            DiaDiemDL diaDiemDL = danhSachDiaDiem.get(i);

            if ( diaDiemDL.getNgayCheckOut() != null ) {
                diaDiemDaDiQua.add(diaDiemDL);
            }
        }

        return diaDiemDaDiQua;
    }

    public ArrayList<QuanNgon> timQuanNgonTheoDiaDiem(String maDiaDiem) {
        ArrayList<QuanNgon> dsKQQN = new ArrayList<QuanNgon>();

        for (int i = 0; i < danhSachQuanNgon.size(); i++) {
            QuanNgon quanNgon = danhSachQuanNgon.get(i);

            if ( quanNgon.getMaDDDL().equals(maDiaDiem) ) {
                dsKQQN.add(quanNgon);
            }
        }

        return dsKQQN;
    }

    public void sapXepQuanNgonTheoKhoangCach(String maDiaDiem) {
        ArrayList<QuanNgon> dsSXQN = timQuanNgonTheoDiaDiem(maDiaDiem);

        if (!dsSXQN.isEmpty()) {
            Collections.sort(dsSXQN, new Comparator<QuanNgon>() {
                @Override
                public int compare(QuanNgon quanNgon1, QuanNgon quanNgon2) {
                    return Double.compare(quanNgon1.getKhoangCach(), quanNgon2.getKhoangCach());
                }
            });

            for (int i = 0; i < dsSXQN.size(); i++) {
                QuanNgon quanNgon = dsSXQN.get(i);

                System.out.println(
                    quanNgon.getTen()
                    + " - địa chỉ: "
                    + quanNgon.getDiaChi()
                    + " - khoảng cách: "
                    + quanNgon.getKhoangCach() + "km"
                );
            }
        } else {
            System.out.println("Địa điểm này chưa có danh sách quán ngon");
        }
    }
}
