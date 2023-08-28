package Buoi2;

import java.util.Scanner;

public class Bai3 {
<<<<<<< HEAD
    static void Sapxep(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nMang sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so luong ptu: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac ptu:");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();
        }
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        Sapxep(a, n);
    }

=======
    public static Scanner sc = new Scanner(System.in);

    static void Xuat_mang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void Bubble_sort(int a[], int n) {
        int tg;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    tg = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tg;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("NHAP SO LUONG PHAN TU: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Bubble_sort(a, n);
        System.out.print("Mang vua sap xep tang dan la: ");
        Xuat_mang(a, n);
    }
>>>>>>> 92ab84b (btvnb5)
}
