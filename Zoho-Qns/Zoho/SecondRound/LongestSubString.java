package Barath.com.Zoho.SecondRound;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "I am a good boy";
        System.out.println(findLonSubString(str));
    }
    static String findLonSubString(String str) {
        int endPoint = 0;
        int count = 0;
        int maxCount = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                if (count > maxCount) {
                    endPoint = i;
                    maxCount = count;
                    count = 0;
                }
                else {
                    count ++;
                }
            }

        }
        return str.substring(endPoint-maxCount, endPoint);
    }
}
