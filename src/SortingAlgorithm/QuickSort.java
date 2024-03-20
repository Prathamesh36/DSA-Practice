package SortingAlgorithm;

import java.util.Scanner;

public class QuickSort {

    public static void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static int partition(int[] a,int low,int high){
        int pivot = a[low];
        int i=low;
        int j=high;
        while (i<j){
            while(i<=high && a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<j) {
                swap(a, i, j);
            }
        }
        swap(a,j,low);
        return j;
    }

    public static void quickSort(int[]a,int low, int high){
        if(low<high){
            int pivot = partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
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
        quickSort(a,0,n-1);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
/*  public static void swap(int[]a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static int partition(int[] a,int low, int high){
        int pivot = a[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<j){
                swap(a, i,j);
            }
        }
        swap(a,j,low);
        return j;
    }

    public static void quickSort(int[] a,int low, int high){
        if(low<high){
            int pivot = partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
        }
    }*/