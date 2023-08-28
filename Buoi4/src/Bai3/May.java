package Bai3;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public void setmaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getmaMay() {
        return maMay;
    }

    public void settenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String gettenMay() {
        return tenMay;
    }

    public void settinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String gettinhTrang() {
        return tinhTrang;
    }

    private static Scanner input = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ma may: ");
        this.maMay = input.nextLine();
        System.out.print("Nhap ten may: ");
        this.tenMay = input.nextLine();
        System.out.print("Nhap tinh trang: ");
        this.tinhTrang = input.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-10s %-10s %-20s\n", maMay, tenMay, tinhTrang);
    }
}
