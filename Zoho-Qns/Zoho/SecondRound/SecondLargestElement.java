package Barath.com.Zoho.SecondRound;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3};
        System.out.println(findSecondLargest(arr));
    }
    static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            }
            else if (i > second && i != first) {
                second = i;
            }
        }
        return second;
    }
}
