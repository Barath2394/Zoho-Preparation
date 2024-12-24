package Barath.com.Zoho.SecondRound;

public class AddTheIntegers {
    public static void main(String[] args) {
        String str = "A5B10C20";
        System.out.println(findTheSum(str));
    }
    static int findTheSum(String str) {
        int sum = 0;
        for (int i=0;i<str.length();i++) {
            StringBuilder ans = new StringBuilder();
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ans.append(str.charAt(i));
                for (int j=i+1;j<str.length();j++) {
                    if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                        ans.append(str.charAt(j));
                    }
                    else {
                        break;
                    }
                }
                sum += Integer.parseInt(ans.toString());
            }
        }
        return sum;
    }
}
