package com.Barath.Zoho.SecondRound;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,0,-8,3,4,-5};
        System.out.println(findTheLargestSubArraySum(arr));
    }
    static int findTheLargestSubArraySum(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int i=0;i<arr.length;i++) {
            if (sum >= 0) {
                sum += arr[i];
            }
            else {
                sum = arr[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
