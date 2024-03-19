package SortingAlgorithm;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] a,int n){
        for(int i=n-1;i>0;i--){
            int didSwap=0;
            for (int j = 0; j < i-1; j++) {
                if(a[j]>a[j+1]){    //if this condition is false for all iteration,
                                    // this means that numbers are in sorted order
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    didSwap=1;          // 1 is assigns to this variable if numbers are not in sorted order
                }
            }
            if(didSwap==0){
                break;
            }
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
        bubbleSort(a,n);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
//Worst and Average : O(n^2)
//Best : O(n) , where already there is sorted array/numbers