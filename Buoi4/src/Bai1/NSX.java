package Bai1;

import java.util.Scanner;

public class NSX {
    private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public NSX() {
    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.dcNSX = dcNSX;
    }

    public void setmaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getmaNSX() {
        return maNSX;
    }

    public void settenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String gettenNSX() {
        return tenNSX;
    }

    public void setdcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

    public String getdcNSX() {
        return dcNSX;
    }

    private static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ma NSX: ");
        this.maNSX = input.nextLine();
        System.out.print("Nhap ten NSX: ");
        this.tenNSX = input.nextLine();
        System.out.print("Nhap dc NSX: ");
        this.dcNSX = input.nextLine();
    }

    public void xuat() {
        System.out.println("Ma NSX: " + maNSX);
        System.out.println("Ten NSX: " + tenNSX);
        System.out.println("DC NSX: " + dcNSX);
    }
}
