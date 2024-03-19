package SortingAlgorithm;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] a,int n){
        for(int i=0;i<n;i++){
            int current =a[i];
            int j=i-1;
            while(j>=0 && current <a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        insertionSort(a,n);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
