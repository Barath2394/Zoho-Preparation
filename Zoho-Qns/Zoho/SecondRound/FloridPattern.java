package Barath.com.Zoho.SecondRound;

public class FloridPattern {
    public static void main(String[] args) {
        zoho(5);
    }
    static void zoho(int n) {
        int k = 1;
        for (int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
