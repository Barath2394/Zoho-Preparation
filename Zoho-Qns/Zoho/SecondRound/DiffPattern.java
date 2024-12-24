package Barath.com.Zoho.SecondRound;

public class DiffPattern {
    public static void main(String[] args) {
        zoho(3);
    }
    static void zoho(int n) {
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                for (int k=0;k<(i*2)+1;k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
