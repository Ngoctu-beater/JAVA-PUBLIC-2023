package Bai3;

import java.util.Scanner;

public class Quanly {
    private String maQL;
    private String hoTen;

    public Quanly() {
    }

    public Quanly(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public void setmaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getmaQL() {
        return maQL;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String gethoTen() {
        return hoTen;
    }

    private static Scanner input = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ma QL: ");
        this.maQL = input.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = input.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-30s %-30s\n", "Ma QL", "Ho ten");
        System.out.printf("%-30s %-30s", maQL, hoTen);
    }
}
