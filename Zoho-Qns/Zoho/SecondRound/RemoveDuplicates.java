package Barath.com.Zoho.SecondRound;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5};
        System.out.println(zoho(arr));
    }
    static List<Integer> zoho(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i< arr.length;i++) {
            int ind = Math.abs(arr[i]) - 1;
            if (arr[ind] < 0) {
                ans.add(ind + 1);
            }
            arr[ind] *= -1;
        }
        return ans;
    }
}
