package Bai1;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private NSX x = new NSX();

    public Hang() {
    }

    public Hang(String maHang, String tenHang, NSX x) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = x;
    }

    public void setmaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getmaHang() {
        return maHang;
    }

    public void settenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String gettenHang() {
        return tenHang;
    }

    public void setx(NSX x) {
        this.x = x;
    }

    public NSX getx() {
        return x;
    }

    private static Scanner input = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ma hang: ");
        this.maHang = input.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenHang = input.nextLine();
        x.nhap();
    }

    public void Xuat() {
        System.out.println("\nMa hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        x.xuat();
    }
}
