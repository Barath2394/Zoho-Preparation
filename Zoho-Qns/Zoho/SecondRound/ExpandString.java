package Barath.com.Zoho.SecondRound;

public class ExpandString {
    public static void main(String[] args) {
        System.out.println(zoho("a1b10"));
    }
    static String zoho(String str) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            i++;
            int repeatCount = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                repeatCount = (repeatCount * 10) + str.charAt(i) - '0';
                i ++;
            }
            for (int j=0;j<repeatCount;j++) {
                ans.append(currentChar);
            }
        }
        return ans.toString();
    }
}
