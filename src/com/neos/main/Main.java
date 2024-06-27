package com.neos.main;

import com.neos.dulich.DiaDiemDL;
import com.neos.dulich.QuanNgon;
import com.neos.quanli.NguoiDung;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NguoiDung nguoiDung = new NguoiDung();

        // thêm địa điểm du lịch
        DiaDiemDL haNoi = new DiaDiemDL("DD01", "Hà Nội", "Thủ đô Việt Nam", "Hà Nội", "Thành phố ngàn năm văn hiến");
        DiaDiemDL saPa = new DiaDiemDL("DD02", "Sa Pa", "Thị trấn mù sương", "Lào Cai", "Nơi có đỉnh Fansipan hùng vĩ");

        nguoiDung.themDiaDiem(haNoi);
        nguoiDung.themDiaDiem(saPa);

        // thêm quán ngon
        QuanNgon phoHaNoi = new QuanNgon("DD01", "Q01", "Phở Hà Nội", "123 Tràng Tiền", "Phở gia truyền", "Phở bò", 1.2);
        QuanNgon bunChaHaNoi = new QuanNgon("DD01", "Q02", "Bún Chả Hà Nội", "456 Hàng Mành", "Bún chả nổi tiếng", "Bún chả", 2.5);
        QuanNgon comLamSaPa = new QuanNgon("DD02", "Q03", "Cơm Lam Sa Pa", "789 Fansipan", "Cơm lam đặc sản", "Cơm lam", 0.5);

        nguoiDung.themQuanNgon(phoHaNoi);
        nguoiDung.themQuanNgon(bunChaHaNoi);
        nguoiDung.themQuanNgon(comLamSaPa);

        // check in và check out
        haNoi.setNgayCheckIn(LocalDate.of(2024, 6, 1));
        haNoi.setNgayCheckOut(LocalDate.of(2024, 6, 5));

        saPa.setNgayCheckIn(LocalDate.of(2024, 6, 6));
        saPa.setNgayCheckOut(LocalDate.of(2024, 6, 10));

        // hiển thị các địa điểm đã đi qua
        ArrayList<DiaDiemDL> diaDiemDaDiQua = nguoiDung.hienThiDiaDiemDaDiQua();
        System.out.println("Các địa điểm đã đi qua:");

        for (int i = 0; i < diaDiemDaDiQua.size(); i++) {
            DiaDiemDL diaDiemDL = diaDiemDaDiQua.get(i);

            System.out.println(diaDiemDL.getTen());
        }

        // quán ngon theo danh sách mã địa điểm du lịch
        ArrayList<QuanNgon> quanNgonHaNoi = nguoiDung.timQuanNgonTheoDiaDiem("DD01");
        System.out.println("\nCác quán ngon ở Hà Nội:");

        for (int i = 0; i < quanNgonHaNoi.size(); i++) {
            QuanNgon quanNgon = quanNgonHaNoi.get(i);

            System.out.println(quanNgon.getTen());
        }

        // sắp xếp các quán ngon theo khoảng cách
        System.out.println("\nDanh sách quán ngon Hà Nội:");
        nguoiDung.sapXepQuanNgonTheoKhoangCach("DD01");
    }
}
