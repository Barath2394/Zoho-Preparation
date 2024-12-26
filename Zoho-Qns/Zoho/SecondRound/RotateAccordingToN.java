package com.Barath.Zoho.SecondRound;

import java.util.*;

public class RotateAccordingToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int digit = 1;
        int num = 0;
        for (int i=n;i>=1;i--) {
            int current = i * digit;
            num += current;
            digit *= 10;
        }
        rotate(num);
    }
    static void rotate(int num) {
        String strNum = String.valueOf(num);
        int len = strNum.length();
        for (int i=0;i<len;i++) {
            String rotatedStr = strNum.substring(i) + strNum.substring(0,i);
            System.out.println(rotatedStr);
        }

    }
}
