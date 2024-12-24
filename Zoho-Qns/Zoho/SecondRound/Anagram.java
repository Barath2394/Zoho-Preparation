package com.Barath.Zoho.SecondRound;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
    }
    static boolean isAnagram(String str1,String str2) {
        int[] freq = new int[26];
        for (char c : str1.toCharArray()) {
            freq[c - 'a'] ++;
        }
        for (char c : str2.toCharArray()) {
            freq[c - 'a'] --;
        }
        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
