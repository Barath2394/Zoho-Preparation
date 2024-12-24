package Barath.com.Zoho.SecondRound;

public class CountingSort {
    public static void main(String[] args) {
        String str = "edsab";
        System.out.println(findTheFrequencyString(str));
    }
    static String findTheFrequencyString(String str) {
        int[] freq = new int[26];
//        Freq Array:
        for (int i=0;i<str.length();i++) {
            freq[str.charAt(i) - 'a'] ++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<26;i++) {
            int count = freq[i];
            for (int j=0;j<count;j++) {
                ans.append((char)(i+'a'));
            }
        }
        return ans.toString();
    }
}
