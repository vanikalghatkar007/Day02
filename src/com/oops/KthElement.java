package com.oops;

import java.util.Scanner;

//K’th Smallest/Largest Element in Unsorted Array
public class KthElement {
    public static void main(String[] args) {
        int[] a= new int[10];
        int n,temp,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the kth element");
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp=a[i];
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("the Kth element is");
        System.out.println(a[k-1]);
    }
}
