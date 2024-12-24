package Barath.com.Zoho.SecondRound;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        List<Integer> ans = findTheLeaders(arr,arr.length);
        System.out.println(ans);
    }
    static List<Integer> findTheLeaders(int[] arr,int n) {
        List<Integer> ans = new ArrayList<>();
        int leader = arr[n-1];
        ans.add(leader);
        for (int i=n-2;i>=0;i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                ans.add(leader);
            }
        }
        return ans;
    }
}
