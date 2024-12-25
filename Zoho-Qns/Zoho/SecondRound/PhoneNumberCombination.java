package com.Barath.Zoho.SecondRound;

import java.util.*;

public class PhoneNumberCombination {
    static String[] keyBoard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        generateCombination("846","");
        System.out.println(list);
    }
    static void generateCombination(String str,String ans) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }
        String key = keyBoard[str.charAt(0) - 48];
        for (int i=0;i<key.length();i++) {
            generateCombination(str.substring(1),ans+key.charAt(i));
        }
    }
}
