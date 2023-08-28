package Bai2;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();

    public Faculty() {
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public void setx(School x) {
        this.x = x;
    }

    public School getx() {
        return x;
    }

    private static Scanner input = new Scanner(System.in);

    public void Nhap() {
        System.out.print("Nhap ten truong: ");
        x.setName(input.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        x.setDate(input.nextLine());
        System.out.print("Nhap ten khoa: ");
        this.Name = input.nextLine();
        System.out.print("Nha ngay vao khoa: ");
        this.Date = input.nextLine();
    }

    public void Xuat() {
        System.out.printf("%-30s%-30s%-30s%-30s\n", x.getName(), x.getDate(), Name, Date);
    }
}
