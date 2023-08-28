package Bai3;

import java.util.Scanner;

public class Phongmay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private Quanly x = new Quanly();
    private May[] y;
    private int n;

    public Phongmay() {
    }

    public Phongmay(String maPhong, String tenPhong, double dienTich, Quanly x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void setmaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getmaPhong() {
        return maPhong;
    }

    public void settenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String gettenPhong() {
        return tenPhong;
    }

    public void setdienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getdienTich() {
        return dienTich;
    }

    public void setx(Quanly x) {
        this.x = x;
    }

    public Quanly getx() {
        return x;
    }

    public void sety(May[] y) {
        this.y = y;
    }

    public May[] gety() {
        return y;
    }

    public void setn(int n) {
        this.n = n;
    }

    public int getn() {
        return n;
    }

    private static Scanner input = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ma phong: ");
        this.maPhong = input.nextLine();
        System.out.print("Nhap ten phong: ");
        this.tenPhong = input.nextLine();
        System.out.print("Nhap dien tich: ");
        this.dienTich = input.nextDouble();
        x.Nhap();
        System.out.print("Nhap so luong may: ");
        n = input.nextInt();

        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may thu " + (i + 1));
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.printf("%-10s %-20s %20s\n", "Ma phong", "Ten phong", "Dien tich");
        System.out.printf("%-10s %-20s %20s", maPhong, tenPhong, dienTich);
        System.out.println();
        x.Xuat();
        System.out.println("\n============================ THÔNG TIN MÁY ============================");
        System.out.printf("%-10s %-10s %-20s\n", "Ma may", "Ten may", "Tinh trang");
        for (int i = 0; i < n; i++) {
            y[i].Xuat();
        }
    }
}
