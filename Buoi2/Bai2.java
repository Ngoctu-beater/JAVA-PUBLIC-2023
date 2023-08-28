package Buoi2;

import java.util.Scanner;

public class Bai2 {
    static int[] Them(int a[], int n, int k, int x) {
        int[] b = new int[n + 1];
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (i == k - 1) {
                b[j] = x;
                j++;
            }
            b[j] = a[i];
        }
        return b;
    }

    static int[] Xoa(int a[], int n, int t) {
        int[] c = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (i == t) {
                j--;
            }
            c[j] = a[i];
        }
        return c;
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

        int k;
        do {
            System.out.print("Nhap vi tri can them: ");
            k = input.nextInt();
            if (k < 0 || k > n) {
                System.out.println("Vi tri ko hop le!");
                System.out.print("Nhap vi tri can them: ");
                k = input.nextInt();
            }
        } while (k < 0 || k > n);
        System.out.print("Nhap gt them: ");
        int x = input.nextInt();
        int[] b = Them(a, n, k, x);
        System.out.print("Mang sau khi them: ");
        for (int value : b) {
            System.out.print(value + " ");
        }

        int t;
        do {
            System.out.print("\nNhap vi tri can xoa: ");
            t = input.nextInt();
            if (t < 0 || t > n) {
                System.out.println("Vi tri ko hop le!");
                System.out.print("Nhap vi tri can xoa: ");
                t = input.nextInt();
            }
        } while (t < 0 || t > n);
        int[] c = Xoa(a, n, t);
        System.out.print("Mang sau khi xoa: ");
        for (int value : c) {
            System.out.print(value + " ");
        }
    }
}
