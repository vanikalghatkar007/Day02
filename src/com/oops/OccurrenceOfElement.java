package com.oops;

import java.util.Scanner;

public class OccurrenceOfElement {
    public static void main(String[] args) {
        int n,x,temp;
     int[] a=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = sc.nextInt();
        System.out.println("enter elements in array");
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
        System.out.println("enter the no. whose occurrence is to be found");
        x=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                c=c+1;
            }
        }
        System.out.println(c);

    }
}
