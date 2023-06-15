package com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,3,2,65,436,3,24,34,5};
        ShellSort(array,9);
        System.out.println(Arrays.toString(array));
    }

    public static void BubbleSort(int[] array){
        int n = array.length-1;
        int temp;
        for(int i = 0;i <= n;i++){
            for(int j = i+1;j <= n;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void QuickSort(int[] array,int low,int high){
        if(low > high){
            return;
        }
        int i = low,j = high,temp = array[low];
        while(i < j){
            while(i < j && array[j] > temp){
                j--;
            }
            if(i < j){
                array[i++] = array[j];
            }
            while(i < j && array[i] < temp){
                i++;
            }
            if(i < j){
                array[j--] = array[i];
            }
        }
        array[i] = temp;
        QuickSort(array,low,i-1);
        QuickSort(array,i+1,high);
    }

    public static void StraightInsertionSort(int[] array,int n){
        int i,j,temp;
        for(i = 1;i <= n;i++){
            if(array[i] < array[i-1]) {
                temp = array[i];
                for(j = i - 1;j >= 0 && array[j] > temp;j--){
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
    }

    public static void ShellSort(int[] array,int n){
        int i,j,k,group,temp;
        for(group = n/2;group > 0;group /= 2){
            for (i = 0;i < group;i++){
                for (j = group + i;j < n;j += group){
                    temp = array[j];
                    k = j - group;
                    while (k >= 0 && array[k] > temp){
                        array[k + group] = array[k];
                        k -= group;
                    }
                    array[k + group] = temp;
                }
            }
        }
    }
}
