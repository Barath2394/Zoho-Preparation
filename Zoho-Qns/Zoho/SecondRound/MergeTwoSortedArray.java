package Barath.com.Zoho.SecondRound;
import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6};
        int[] arr2 = {2,5,7,8};
        System.out.println(zoho(arr1,arr2));
    }
    static List<Integer> zoho(int[] arr1,int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0,j = 0;
        int n = arr1.length;
        int m = arr2.length;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                ans.add(arr2[j]);
                j ++;
            }
        }
        while (i < n) {
            ans.add(arr1[i++]);
        }
        while (j < m) {
            ans.add(arr2[j++]);
        }
        return ans;
    }
}
