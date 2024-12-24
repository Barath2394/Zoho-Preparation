package com.Barath.Zoho.SecondRound;

import java.util.Scanner;

public class PrintTheNextGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values : ");
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        printNextLarger(arr);
    }
    static void printNextLarger(int[] arr) {
        for (int i = 0;i < arr.length; i++) {
            int big = Integer.MAX_VALUE;
            boolean flag = false;
            for (int j = 0;j < arr.length;j++) {
                if (arr[j]  > arr[i]) {
                    if (arr[j] < big) {
                        big = arr[j];
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.print(arr[i] + "->" + big + ",");
            }
            else {
                System.out.print(arr[i] + "->" + ",");
            }
        }
    }
}
