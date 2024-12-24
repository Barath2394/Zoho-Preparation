package Barath.com.Zoho.SecondRound;
import java.util.*;
public class UnionSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int [5];
        int [] arr2 = new int [3];
        System.out.println("Enter the elements of arr1 : ");
        for (int i=0;i<5;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of arr2 : ");
        for (int i=0;i<3;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int size = Dounion(arr1,5,arr2,3);
        System.out.print("Size of the union set array : " + size);
    }
    public static int Dounion(int[] a,int m,int[] b,int n)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i : a)
        {
            set.add(i);
        }
        for(int j : b)
        {
            set.add(j);
        }
        return set.size();
    }
}
