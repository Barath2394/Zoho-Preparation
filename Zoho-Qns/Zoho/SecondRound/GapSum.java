package Barath.com.Zoho.SecondRound;

import java.util.ArrayList;
import java.util.List;

public class GapSum {
    static List<Integer> ans= new ArrayList<>();
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        findTheSums(arr,3);
        System.out.println(ans);
    }
    static void findTheSums(int[] arr,int gap) {
        for (int i=0;i<gap;i++) {
            int sum = 0;
            for (int j=i;j<arr.length;j+=3) {
                sum += arr[j];
            }
            ans.add(sum);
        }
    }
}
