package Barath.com.Zoho.SecondRound;
import java.util.*;
public class SnakePattern {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},    
                       {4,5,6},
                       {7,8,9}};
        printInSnakeOrder(arr);
        System.out.println(ans);
    }
    static void printInSnakeOrder(int[][] arr) {
        int len = arr[0].length;
        for (int i=0;i<len;i++) {
            if (i % 2 == 0) {
                for (int j=0;j<len;j++) {
                    ans.add(arr[i][j]);
                }
            }
            else {
                for (int j=len-1;j>=0;j--) {
                    ans.add(arr[i][j]);
                }
            }
        }
    }
}
