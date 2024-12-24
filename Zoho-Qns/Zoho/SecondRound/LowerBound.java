package Barath.com.Zoho.SecondRound;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(zoho(arr,3));
    }
    static int zoho(int[] arr,int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
