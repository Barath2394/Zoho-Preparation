package Barath.com.Zoho.SecondRound;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4};
        moveZerosToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void moveZerosToEnd(int[] arr) {
        int nz = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] != 0) {
                swap(arr, i, nz);
                nz++;
            }
        }
    }
    static void swap(int[] arr,int i,int nz) {
        int temp = arr[i];
        arr[i] = arr[nz];
        arr[nz] = temp;
    }
}
