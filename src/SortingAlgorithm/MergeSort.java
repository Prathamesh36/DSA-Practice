package SortingAlgorithm;

import java.util.Scanner;

public class MergeSort {

    public static void conquer(int[] a,int start,int mid,int end){
        int[] merged= new int[end-start+1];

        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=end){
            if(a[idx1]<=a[idx2]){
                merged[x++]=a[idx1++];
            }
            else{
                merged[x++]=a[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++]=a[idx1++];
        }

        while (idx2 <= end){
            merged[x++]=a[idx2++];
        }
        for (int i = 0,j=start; i <merged.length ; i++,j++) {
            a[j]=merged[i];
        }
    }

    public static void mergeSort(int[] a,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start + (end -start)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);
        conquer(a,start,mid,end);

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
        mergeSort(a,0,n-1);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
//time complexity: O(nlogn)