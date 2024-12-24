package Barath.com.Zoho.SecondRound;

public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = {10,20,15,5};
        System.out.println(findTheNoOfSubArray(arr,25,0));
    }
    static int findTheNoOfSubArray(int[] arr,int sum,int i) {
        if (sum == 0) {
            return 1;
        }
        if (sum < 0 || i == arr.length) {
            return 0;
        }
        return findTheNoOfSubArray(arr,sum-arr[i],i+1)
                +
                findTheNoOfSubArray(arr,sum,i+1);
    }
}
