package com.Barath.Zoho.SecondRound;

import java.util.Scanner;

public class FindTheNumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        int ans = rangeNumber(arr,x,y);
        System.out.print("Enter the number bet " + x +" and " + y + " is : " + ans);
    }

    private static int rangeNumber(int[] arr, int x, int y) {
        for (int i : arr) {
            if (i > x && i < y) {
                return i;
            }
        }
        return -1;
    }
}
