package Bai2;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Class1;
    private double Score;
    private Faculty y = new Faculty();

    public Student() {
    }

    public Student(String Name, String Class1, double Score, Faculty y) {
        this.Name = Name;
        this.Class1 = Class1;
        this.Score = Score;
        this.y = y;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setClass1(String Class1) {
        this.Class1 = Class1;
    }

    public String getClass1() {
        return Class1;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public double getScore() {
        return Score;
    }

    public void sety(Faculty y) {
        this.y = y;
    }

    public Faculty gety() {
        return y;
    }

    private static Scanner input = new Scanner(System.in);

    public void Input() {
        System.out.print("Nhap ten SV: ");
        this.Name = input.nextLine();
        System.out.print("Nhap lop: ");
        this.Class1 = input.nextLine();
        System.out.print("Nhap diem: ");
        this.Score = input.nextDouble();
        y.Nhap();
        input.nextLine();
    }

    public void Output() {
        System.out.printf("%-20s%-10s%-13s", Name, Class1, Score);
        y.Xuat();
    }
}
