package com.oops;

import java.util.Scanner;

// reverse an array or string
public class reverse {
    public static void main(String[] args) {
        int n, temp;
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        n = sc.nextInt();
        System.out.println("enter the elements" + n);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println("Reversed array is");
        for (int i = 0; i < n; i++) {
            System.out.print (a[i]);
        }
    }
}
