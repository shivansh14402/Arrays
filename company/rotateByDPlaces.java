package com.company;

public class rotateByDPlaces {

    static void RotateDPlaces(int[] arr, int d){
        int[] temp = new int[d];
        int l = arr.length;
        int x = l-d;
        int y =0;

        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=0;i<l-d;i++){
            arr[i] = arr[i+d];
        }

        for(int i=x;i<l;i++){
            arr[i]=temp[y];
            y++;
        }
    }

    static void RotateDPlaces2(int[] arr, int d){

        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    static void reverse(int[] arrs, int start, int end){
        while(start<=end){
            int temp = arrs[start];
            arrs[start] = arrs[end];
            arrs[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        RotateDPlaces(x, 4);
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
