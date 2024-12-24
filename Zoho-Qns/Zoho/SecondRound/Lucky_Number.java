package Barath.com.Zoho.SecondRound;

public class Lucky_Number {
    public static void main(String[] args) {
        System.out.println(zoho(13,2));
    }
    static boolean zoho(int n,int counter) {
        if (n < counter) {
            return true;
        }
        if (n % counter == 0) {
            return false;
        }
        return zoho(n-(n/counter),counter + 1);
    }
}
