package com.Barath.Zoho.SecondRound;

import java.util.*;

public class PrintTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        printVowels(str);
    }
    static void printVowels(String str) {
        System.out.println("Vowels in the given String are :");
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                System.out.print(c + " ");
            }
        }
    }
    static boolean isVowel(char c) {
        return (c =='A' || c == 'a') || (c =='E' || c == 'e') || (c =='I' || c == 'i') ||
                (c =='O' || c == 'o') || (c =='U' || c == 'u');
    }
}
