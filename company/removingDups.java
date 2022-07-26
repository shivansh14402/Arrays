package com.company;

public class removingDups {
    public static void main(String args[]){

        int[] arr = {10,20,20,40,40,70,70,80,90,100};
        int x = removeDuplicates(arr);

        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int removeDuplicates(int[] arr){
        int size = arr.length;
        int res = 1;
        for(int i=1;i<size;i++){
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
