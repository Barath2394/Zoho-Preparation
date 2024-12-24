package Barath.com.Zoho.SecondRound;

public class FindTheOddPosPrime {
    public static void main(String[] args) {
        zoho(10);
    }
    static void zoho(int num) {
        int count = 0;
        for (int i=2;i<=num;i++){
            if (isPrime(i)) {
                count ++;
                if (count % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i=2;i<=n/2;i++) {
            if (n % i == 0) {
                count ++;
            }
        }
        return count == 0;
    }
}
