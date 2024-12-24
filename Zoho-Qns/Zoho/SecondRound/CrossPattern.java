package Barath.com.Zoho.SecondRound;

public class CrossPattern {
    public static void main(String[] args) {
        printCross(5);
    }
    static void printCross(int n) {
        int m = n / 2;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i == j) {
                    if (i < m) {
                        System.out.print(n-i + " ");
                    }
                    else {
                        System.out.print(i+1 + " ");
                    }
                }
                 else if ((i+j) == n-1) {
                    if (i < m) {
                        System.out.print(i+1 + " ");
                    }
                    else {
                        System.out.print(j+1 + " ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
