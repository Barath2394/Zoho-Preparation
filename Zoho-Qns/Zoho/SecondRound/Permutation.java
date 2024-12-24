package Barath.com.Zoho.SecondRound;

import java.util.*;

public class Permutation {
    static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        char[] arr = {'A','B','C'};
        findPermutation(arr,0);
        System.out.println(ans);
    }
    static void findPermutation(char[] ch,int fi) {
        if (fi == ch.length-1) {
            ans.add(new String(ch));
            return;
        }
        for (int i=fi;i<ch.length;i++) {
            swap(ch,i,fi);
            findPermutation(ch,fi+1);
            swap(ch,i,fi);
        }
    }

    private static void swap(char[] ch, int i, int fi) {
        char temp = ch[i];
        ch[i] = ch[fi];
        ch[fi] = temp;
    }
}
