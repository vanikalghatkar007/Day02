package com.oops;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        int n,max,min;
        int[] a= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n= sc.nextInt();
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        max=min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>a[0])
                max=a[i];
            else if  (a[i]<a[0])
                min=a[i];
        }
        System.out.println("largest number is "+max);
        System.out.println("smallest number is "+min);


    }

}
