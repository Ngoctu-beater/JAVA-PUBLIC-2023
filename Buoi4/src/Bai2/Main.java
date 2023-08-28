package Bai2;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so luong SV: ");
        int n = input.nextInt();

        Student[] sv = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin SV thu " + (i + 1));
            sv[i] = new Student();
            sv[i].Input();
        }

        System.out.printf("%-20s%-10s%-10s%-30s%-30s%-30s%-30s\n", "Ten SV", "Lop", "Diem", "Truong",
                "Ngay vao truong", "Khoa", "Ngay vao khoa");
        for (int i = 0; i < n; i++) {
            sv[i].Output();
        }
    }
}
