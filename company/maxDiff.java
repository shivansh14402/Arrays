package com.company;

public class maxDiff {

    static void maxDif(int arr[]){
        int n = arr.length;
        int max=arr[1]-arr[0];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]>max){
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.print(max);
    }

    static void maxDif2(int[] arr){
        int n = arr.length;
        int minVal = arr[0];

        int max = arr[1];

        for(int j=2;j<n;j++){
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[j]<minVal){
                minVal = arr[j];
            }
        }
        int res = max - minVal;
        System.out.print(res);
    }

    public static void main(String[] args){
        int[] x = {1,2,3,4,5,-60,7,8,9,10};
        int[] y = {-1,-2};
        maxDif2(x);
//        for (int i=0;i<x.length;i++){
//            System.out.print(x[i]+" ");
//        }
    }
}
