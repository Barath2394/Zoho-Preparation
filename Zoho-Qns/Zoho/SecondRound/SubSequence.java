package Barath.com.Zoho.SecondRound;


import java.util.*;

public class SubSequence {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        generateStrings("abc","");
        System.out.println(list);
    }
    static void generateStrings(String str,String ans) {
//        Base Condition
        if (str.length() == 0) {
            list.add(new String(ans));
            return;
        }
//        Picking The element
        generateStrings(str.substring(1),ans+str.charAt(0));
//        Not Picking the element
        generateStrings(str.substring(1),ans);
    }
}
