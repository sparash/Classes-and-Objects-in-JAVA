import java.util.Scanner;
import java.util.*;
 class SortWave
{
     public static void main(String args[])
    {
        SortWave ob = new SortWave();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int arr[], int n)
    {
        Arrays.sort(arr);
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
}