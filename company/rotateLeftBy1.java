package com.company;

public class rotateLeftBy1 {

    static void rotateLeft(int[] arr){
        int temp = arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        rotateLeft(x);
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
