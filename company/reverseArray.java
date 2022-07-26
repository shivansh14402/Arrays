package com.company;

public class reverseArray {

    static void reverseArray(int[] arr){
        int j = arr.length-1;
        for(int i=0;i<j;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        reverseArray(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
