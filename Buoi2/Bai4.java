package Buoi2;

import java.util.Scanner;

public class Bai4 {
<<<<<<< HEAD
    static boolean Doixung(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                return true;
            }
        }
        return false;
=======
    public static boolean xuLy(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

>>>>>>> 92ab84b (btvnb5)
    }

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.print("Nhap chuoi: ");
        String s = input.nextLine();
        boolean t = Doixung(s);
        if (t == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
=======
        System.out.print("Nhap chuoi la: ");
        String s = input.nextLine();
        System.out.println(xuLy(s));
>>>>>>> 92ab84b (btvnb5)
    }
}
