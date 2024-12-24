package Barath.com.Zoho.SecondRound;

import java.util.HashMap;

public class FindTheFreqAndNumAreSame {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,1,2,4};
        zoho(arr);
    }
    static void zoho(int[] arr) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i : arr) {
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        for (int key : mpp.keySet()) {
            if (key == mpp.get(key)) {
                System.out.print(key + " ");
            }
        }
    }
}
