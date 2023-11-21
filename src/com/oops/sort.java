package com.oops;

import java.util.Scanner;

//Write a program to sort the given array
public class sort {
    public static void main(String[] args) {
        int n,temp;
        int[] a = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements in array");
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}
